package EnumExample;

public class Basic {
    enum Week{
        Monday,Tuesday,wednesday,thursday,friday,saturday,sunday;
//        these are enum constants
//        public ,static and final
//        since its final you can create child enums
//        type is Week


        Week(){
            System.out.println("Constructor Called "+this);
//            this not enum concept
//            we don't want to create new object
//            internally: public static final Week Monday = new Week();


        }


    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
//        for (Week day:Week.values()
//             ) {
//            System.out.println(day);
//        }


//      ordinal -return index or position of enum
//        System.out.println(week.ordinal());
    }
}
