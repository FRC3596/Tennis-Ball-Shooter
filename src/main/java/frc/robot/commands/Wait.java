package frc.robot.commands;

public class Wait { 
    
    // Delay function
    // Will freeze code at the current point but does not do it in a way that freezes the bot
    public static void Delay(long ms)
    {
        if (ms < 0) { return; }

        Thread thr = new Thread() {
            public void run() {
                try
                { Thread.sleep(ms); }
                catch (Exception e) {}
            };
        };
        thr.start();

        try
        { thr.join(); }
        catch (Exception e) {}
    }

}
