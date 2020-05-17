package 迪米特;

public class 迪米特 {
    public static void main(String[] args)
    {
        Agent agent=new Agent();
        agent.setStar(new Star("林心如"));
        agent.setFans(new Fans("粉丝"));
        agent.setCompany(new Company("中国传媒"));
        agent.meeting();
        agent.business();
    }
}
