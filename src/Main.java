import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //creating main artist
        Singer mainSinger = new Singer("Taylor Swift");

        //creating tracks
        Track track1 = new Track("Lavender Haze", 189);
        Track track2 = new Track("All Too Well", 197);
        Track track3 = new Track("The Lakes", 201);
        Track track4 = new Track("The Man", 181);
        Track track5 = new Track("Love Story", 192);

        //creating backup singers
        BackupSinger singer1 = new BackupSinger("Jeslyn");
        BackupSinger singer2 = new BackupSinger("Melanie");

        //creating backup dancers
        BackupDancer dancer1 = new BackupDancer("Stephanie");
        BackupDancer dancer2 = new BackupDancer("Jake");

        //creating a live performance
        LivePerformance livePerformance = new LivePerformance(mainSinger, "Eras Tour", 2023, "Glendale");

        //adding backupSingers
        livePerformance.addBackupSinger(singer1);
        livePerformance.addBackupSinger(singer2);

        //adding backupDancers
        livePerformance.addBackupDancer(dancer1);
        livePerformance.addBackupDancer(dancer2);

        //adding songs
        livePerformance.addSong(track1);
        livePerformance.addSong(track2);
        livePerformance.addSong(track3);
        livePerformance.addSong(track4);
        livePerformance.addSong(track5);

        //initiating the performance
        //I created a method for initiate performance rather than using the constructor
        //It looks cleaner this way
        livePerformance.initiate();

        //checking other implemented methods
        System.out.println("\nCalling other implemented methods............\n");
        livePerformance.record();
        livePerformance.interact();

        //Scanner to pause the exe file execution
        System.out.println("\nEnter any key to exit...............");
        Scanner pause = new Scanner(System.in);
        String exit = pause.nextLine();
        pause.close();
    }
}
