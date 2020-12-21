import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hanoi {

    private int nDisks;
    private String[] towers={"A","B","C"};
    private List<String> steps;

    private void move(int n,String from,String to,String helper){
        if(n>0) {
            move(n - 1, from, helper, to);
            steps.add("Moved disk-" + n + " from tower-" + from + " to tower-" + to);
            move(n - 1, helper, to, from);
        }
    }

    public static void main(String[] args) {
        Hanoi hanoi=new Hanoi();
        hanoi.steps=new ArrayList<>();
        System.out.println("Enter the number of disks : ");
        Scanner scanner=new Scanner(System.in);
        hanoi.nDisks=scanner.nextInt();
        hanoi.move(hanoi.nDisks,hanoi.towers[0],hanoi.towers[2],hanoi.towers[1]);
        for(int i=0;i<hanoi.steps.size();i++)
            System.out.println("Step "+(i+1)+" : "+ hanoi.steps.get(i));
        System.out.println("Total "+hanoi.steps.size()+" steps");
    }
}
