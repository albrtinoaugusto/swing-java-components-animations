package services;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;

/**
 *
 * @author Albertino Augusto
 */
public class DateTime
{

    private int day;
    private int year;
    private int month;

    private int hour;
    private int mins;
    private int secs;
    private int am_pm;

    private final Calendar calendar;

    public DateTime()
    {
        calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR);
        this.mins = calendar.get(Calendar.MINUTE);
        this.secs = calendar.get(Calendar.SECOND);
        this.am_pm = calendar.get(Calendar.AM_PM);

        this.day = calendar.get(Calendar.DAY_OF_MONTH);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);

    }



    public void setTimeToThis(JLabel label)
    {
        int timeRun = 0;

        new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    while (timeRun == 0)
                    {
                        Calendar calendar = new GregorianCalendar();
                        int hour = calendar.get(Calendar.HOUR);
                        int min = calendar.get(Calendar.MINUTE);
                        int sec = calendar.get(Calendar.SECOND);
                        int am_pn = calendar.get(Calendar.AM_PM);

                        String day_night;

                        if (am_pn == 0)
                        {
                            day_night = "AM";
                        }
                        else
                        {
                            day_night = "PM";
                        }

                        if (hour == 0)
                        {
                            hour = 12;
                        }

                        String time = hour + ":" + min + ":" + sec + " " + day_night;
                        label.setText(time);
                    }
                }
                catch (Exception e)
                {

                }
            }
        }.start();
    }

}
