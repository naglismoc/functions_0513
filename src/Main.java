public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sayHi();
        sayHiTo("Dovydas");
        sayHiTo("Lurda");
        String vardas = "Vytautas";
        sayHiTo(vardas);
        Math.random();
        Math.round(4.13);
        simPi();
        System.out.println(simPi());
        System.out.println(nameFormat("nAgLiS"));
        System.out.println(nameFormat("naglis jonas"));
        System.out.println(nameFormat(" naglis"));
        System.out.println(nameFormat("a"));
        System.out.println(nameFormat(""));
        System.out.println(nameFormat("   "));
        System.out.println(Matematika.sum(4,5));
        System.out.println(Matematika.sum(4.16,5.30));

    }

    public static String nameFormat(String name){// To: Naglis, From: naglis NAGLIS nAGLIS
        name = name.trim();
        if(name.isEmpty()){
            return "";
        }
        String nameResult = "";
        String[] nameParts = name.split(" ");
        for (int i = 0; i < nameParts.length; i++) {
            nameResult += nameParts[i].substring(0,1).toUpperCase()
                    + nameParts[i].substring(1).toLowerCase() + " ";
        }
        return nameResult.substring(0, nameResult.length() -1);
    }
    public static double simPi(){// simplified PI
        return 3.14;
    }
    public static void sayHiTo(String name){
        System.out.println("Hi " + name);
    }
    public static void sayHi(){
        System.out.println("Hi!");
    }
}