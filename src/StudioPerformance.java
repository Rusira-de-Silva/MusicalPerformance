public class StudioPerformance extends Performance{

    public StudioPerformance(Singer mainArtist, String name, int year, String venue) {
        super(mainArtist, name, year, venue);
    }

    @Override
    public void record() {
        System.out.println("This is the method record in the class StudioPerformance.");
    }

    public void audioProcessing(){
        System.out.println("This is the method audioProcess in the class StudioPerformance.");
    }
}
