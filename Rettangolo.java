public class Rettangolo extends Forma{
    private int sideA;
    private int sideB;

    public Rettangolo(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void area(){
        System.out.println("L'area del rettangolo è " + (sideA*sideB));
    };

}
