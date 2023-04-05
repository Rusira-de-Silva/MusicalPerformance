import java.util.ArrayList;

public abstract class Performance {
    private Singer mainArtist;
    private String name;
    private final int year;
    private final String venue;
    private ArrayList<BackupSinger> backupSingers = new ArrayList<>();
    private ArrayList<BackupDancer> backupDancers = new ArrayList<>();
    private ArrayList<Track> trackList = new ArrayList<>();

    public Performance(Singer mainArtist, String name, int year, String venue) {
        this.mainArtist = mainArtist;
        this.name = name;
        this.year = year;
        this.venue = venue;
    }

    public void initiate(){
        System.out.println("Welcome to the Performance " + this.name + " by " + mainArtist.getName() + " !");
        mainArtist.sing();
        for (BackupSinger singer: backupSingers) {
            singer.backup();
        }
        for (BackupDancer dancer: backupDancers) {
            dancer.backup();
        }
    }

    public void addSong(Track track){
        trackList.add(track);
    }

    public void removeSong(Track track){
        trackList.remove(track);
    }

    public void addBackupSinger(BackupSinger singer){
        backupSingers.add(singer);
    }

    public void removeBackupSinger(BackupSinger singer){
        backupSingers.remove(singer);
    }

    public void addBackupDancer(BackupDancer dancer){
        backupDancers.add(dancer);
    }

    public void removeBackupDancer(BackupDancer dancer) {
        backupDancers.remove(dancer);
    }

    public abstract void record();

    public int getYear() {
        return year;
    }

    public String getVenue() {
        return venue;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
