public class LivePerformance extends Performance{

    public LivePerformance(Singer mainArtist, String name, int year, String venue) {
        super(mainArtist, name, year, venue);
    }

    @Override
    public void record() {
        System.out.println("This is the method record in the class LivePerformance.");
    }

    public void interact(){
        System.out.println("This is the method interact in the class LivePerformance.");
    }

}
