public class Zippo { //1
    public static void baffle(String blimp) { //7
        System.out.println(blimp); //8
        zippo("ping", -5); //9
    }
    public static void zippo(String quince, int flag) { //3
        if (flag < 0) { //4
            System.out.println(quince + " zoop"); //10
        } else { //5
            System.out.println("ik"); //6
            baffle(quince); //7
            System.out.println("boo-wa-ha-ha"); //11
        }
    }

    public static void main(String[] args) { //2
        zippo("rattle", 13); //3
    }
}
