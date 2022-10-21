
package org.asdfgamer.hilfreich;

/**
 * Dies sind die verschiedenen Logginglevel.
 * @author ASDFGamer
 */
public enum LogLevel 
{
    VERBOSE(-2), DEBUG(-1), INFO(0), WARNUNG(1),FEHLER(2),FATAL_ERROR(3),ERROR_LEVEL(2);
    
    /**
     * Dies gibt das logginglevel als Zahl an.
     */
    private int level;
    
    /**
     * Dies speichert die richtige Zahl zu dem richtigen Logginglevel.
     * @param level Das Level als int
     */
    private LogLevel(int level)
    {
        this.level = level;
    }
    
    /**
     * Dies gibt das Logginglevel in Int umgewandelt zurück
     * @return Das Logginglevel als int.
     */
    public int getLevel()
    {
        return level;
    }
}
