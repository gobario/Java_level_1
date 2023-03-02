public class lesson5 {
    public static void main(String[] args) {
        employee[] persArray = new employee[5];
        persArray[0] = new employee("Dmitrii", "QA", "123@123", "32155", 15, 14);
        persArray[1] = new employee("Denis", "Hearthstone", "321@123", "5466", 0, 16);
        persArray[2] = new employee("Muzaffar", "God", "MA@123", "999", 150, 42);
        persArray[3] = new employee("Lev", "Billionaire", "leon@123", "null", 1500, 48);
        persArray[4] = new employee("Chubok", "Anime", "sos@123", "999987", 15, 18);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) {
                persArray[i].conc();
            }
        }
    }
}
