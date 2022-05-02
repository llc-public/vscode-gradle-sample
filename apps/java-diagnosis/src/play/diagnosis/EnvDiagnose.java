package play.diagnosis;

import java.util.Date;

/**
 * Print Environment Info
 */
public class EnvDiagnose {
  public void run() {
    System.out.println(new Date());
    System.getProperties().list(System.out);
    System.out.println(System.getProperty("user.name"));
    System.out.println(System.getProperty("java.library.path"));
  }
}
