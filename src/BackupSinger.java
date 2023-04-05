public class BackupSinger extends Singer implements IBackup{
    public BackupSinger(String name) {
        super(name);
    }

    @Override
    public void backup() {
        System.out.println("This is the method backup in the class BackupSinger.");
    }
}
