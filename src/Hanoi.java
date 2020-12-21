import java.util.Scanner;

public class Hanoi {

    private int nDisks;
    private String[] towers={"A","B","C"};

    private void move(int n,String from,String to,String helper){
        if(n>0) {
            move(n - 1, from, helper, to);
            System.out.println("Moved disk-" + n + " from tower-" + from + " to tower-" + to);
            move(n - 1, helper, to, from);
        }
    }

    public static void main(String[] args) {
        Hanoi hanoi=new Hanoi();
        System.out.println("Enter the number of disks : ");
        Scanner scanner=new Scanner(System.in);
        hanoi.nDisks=scanner.nextInt();
        hanoi.move(hanoi.nDisks,hanoi.towers[0],hanoi.towers[2],hanoi.towers[1]);
    }
}
