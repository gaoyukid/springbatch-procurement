package sample.csv.process;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebsiteReaderJobLauncher {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "sample/csv/process/config/batch-url-to-db.xml");
        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("urlReadJob");

        try {
            /* run job */
            JobExecution result = launcher.run(job, new JobParameters());
            /* finish & print result */
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}