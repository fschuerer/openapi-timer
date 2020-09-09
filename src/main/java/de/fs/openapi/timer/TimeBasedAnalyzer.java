package de.fs.openapi.timer;

import java.util.Date;
import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton
public class TimeBasedAnalyzer {
    
    @Schedule(hour = "*", minute = "*", second = "*/5")
    void analyze() {
        System.out.println("analyzing at " + new Date());
    }
}
