package org.lukasz.succes;

public class Witacz {
    public static String[] dayNames = new String[]{
            "PONIEDZIALEK",
            "WTOREK",
            "SRODA",
            "CZWARTEK",
            "PIATEK",
            "SOBOTA",
            "NIEDZIELA"
    };
    public static String nazwaDnia2 (int i){
        return dayNames[i-1];
    }

    public static void main(String[] args) {
        String country = "POLISH";
        welcome(country);
        welcome("German");
        welcome("France");
        welcome("arabia");
        System.out.println(nazwaDnia(5));


    }

    private static void welcome(String country) {
        switch (country) {
            case "POLISH":
                System.out.println("Czesc,Siema!");
                break;
            case "German":
                System.out.println("HALLO");
                break;
            case "English":
                System.out.println("HI!");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Sory I don't szprechem");
        }
    }

    public static String nazwaDnia(int i) {
        switch (i) {
            case 1:
                return "PONIEDZIALEK";
            case 2:
                return "WTOREK";
            case 3:
                return "SRODA";
            case 4:
                return "CZWARTEK";
            case 5:
                return "PIATEK";
            case 6:
                return "SOBOTA";
            case 7:
                return "NIEDZIELA";
            default:
                return null;
        }


    }
}

