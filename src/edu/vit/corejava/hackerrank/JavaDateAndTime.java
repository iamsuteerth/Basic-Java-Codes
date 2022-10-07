package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

class Result {

    private LocalDate date;

    public Result(){};
    public Result(String date){
        this.date = LocalDate.parse(date);
    }
    
    public String findDay(Result res) {
        LocalDate temp = res.date;
        return temp.getDayOfWeek().toString();

    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Result [date=" + date + "]";
    }
    
}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String mm = "%02d".formatted(month);
        String dd = "%02d".formatted(day);
        String yy = "%02d".formatted(year);

        Result r = new Result(yy+"-"+mm+"-"+dd);

        String res = r.findDay(r);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}