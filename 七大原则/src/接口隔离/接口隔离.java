package 接口隔离;

public class 接口隔离 {
    public static void main(String[] args)
    {
        InputModule input =StuScoreList.getInputModule();
        CountModule count =StuScoreList.getCountModule();
        PrintModule print =StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
    }
}
