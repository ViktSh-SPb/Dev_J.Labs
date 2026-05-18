package org.viktsh.files;

import java.util.LinkedList;
import java.util.List;

public class MediaDuration {
    private int durationSec;

    public MediaDuration(int durationSec) {
        setDurationSec(durationSec);
    }
    public MediaDuration(String durationText){
        if(durationText.matches("[0-9][0-9]:[0-5][0-9]:[0-5][0-9]")||durationText.matches("[0-5][0-9]:[0-5][0-9]")||durationText.matches("[0-5][0-9]")){
            String[] parts = durationText.split(":");
            int factor = 1;
            for (int i = parts.length-1; i>=0; i--){
                durationSec+=Integer.parseInt(parts[i])*factor;
                factor=factor*60;
            }
        }else {
            throw new IllegalArgumentException("Недопустимый формат времени");
        }
    }
    public int ofSeconds(){return durationSec;}
    public int ofMinutes(){return durationSec/60;}
    public int ofHours(){return durationSec/3600;}
    public int getDurationSec() {
        return durationSec;
    }

    @Override
    public String toString() {
        List<Integer> timeUnits = new LinkedList<>();
        timeUnits.add(durationSec/3600); // добавляем часы
        timeUnits.add(durationSec%3600/60); // добавляем минуты
        timeUnits.add(durationSec%3600%60); // добавляем секунды
        StringBuilder stringOfTime = new StringBuilder();
        for(int unit:timeUnits){
            if(unit>0){
                stringOfTime.append(String.format("%02d:", unit));
            }
        }
        if(stringOfTime.charAt(stringOfTime.length()-1)==':'){
            stringOfTime.setLength(stringOfTime.length()-1);
        }
        return stringOfTime.toString();
    }

    public void setDurationSec(int durationSec) {
        this.durationSec = durationSec;
    }
}
