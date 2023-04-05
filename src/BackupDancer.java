public class BackupDancer extends Artist implements IBackup{
    public BackupDancer(String name) {
        super(name);
    }

    @Override
    public void backup() {
        System.out.println("This is the method backup in the class BackupDancer.");
    }
}
