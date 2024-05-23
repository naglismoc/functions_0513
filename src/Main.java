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

        sumPrint(5,60);
        System.out.println(PISq());
        System.out.println(multiply(5,20));
        int[] arr = {4,18,10};
        printArr(arr);
        int[] rndArr = rndIntArr(2,10,9);
        printArr(rndArr);
        System.out.println(sumArr(rndArr));
        System.out.println(avgArr(rndArr));
        printCountSpacesAndSymbols("Šiandien labai graži diena");
        System.out.println(encode("Naglis"));
    }


//    Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.
    public static void sumPrint(int a, int b){
        System.out.println(a + b);
    }
//    Sukurkite Funkciją kuri vadinasi PISq. Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.
    public static double PISq(){
        return  9.8596;
    }
//    Sukurkite Funkciją kuri priima du int tipo kintamuosius. Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.
    public static int multiply(int a, int b){
        return a * b;
    }
//    Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir atspausdina kiekvieną skaičių vienoje eilutėje.
    public static void printArr(int[] arr){
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + ",";
        }
        System.out.println(res.substring(0,res.length() - 1) + ";");
    }
//    Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.
    public static int rndInt(int min, int max){
        return min + (int) Math.round(Math.random() * (max - min));
    }
//    Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų. Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.

    public static int[] rndIntArr(int min, int max, int length){
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndInt(min,max);
        }
        return arr;
    }
//    Sukurkite Funkciją kuri panaudotų 6toje užduotyje sugeneruotą masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
    public static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

//    Sukurkite Funkciją kuri priimtų 6toje užduotyje sugeneruotą masyvą ir gražintų jos skaičių vidurkį (double).

    /**
     * si funkcija skaiciuoja vidurki.
     * @param arr
     * @return double tipo reiksme
     */
    public static double avgArr(int[] arr){
        return sumArr(arr) / (double) arr.length;
    }
//    Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis. Pirmas int - išoriniam ciklui, antras vidiniam.
//    Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių(simbolių) ir tarpų. Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)
    public static void printCountSpacesAndSymbols(String text){
        System.out.println("tarpu yra "  + (text.length() - text.replace(" ", "").length() +
                ", simboliu " + text.replace(" ", "").length()));
    }
//    Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų. Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.
    public static String encode(String text){
        String res = "";
//        for (int i = text.length() - 1; i >= 0 ; i--) {
//            res += text.charAt(i);
//        }
        for (int i = 0; i < text.length(); i++) {
            res = text.charAt(i) + res;
        }
        return res;
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