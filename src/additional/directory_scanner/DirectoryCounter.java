package additional.directory_scanner;

public class DirectoryCounter {
    private int fileCounter;
    private int folderCounter;
    private int hiddenObjectCounter;
    private int txtCounter;

    public void incrementFileCounter() {
        this.fileCounter++;
    }

    public void incrementFolderCounter() {
        this.folderCounter++;
    }

    public void incrementHiddenObjectCounter() {
        this.hiddenObjectCounter++;
    }

    public void incrementTxtCounter() {
        this.txtCounter++;
    }

    @Override
    public String toString() {
        return  "Количество файлов = " + fileCounter +
                ", количество папок = " + folderCounter +
                ", количество скрытых объектов = " + hiddenObjectCounter +
                ", количество .txt файлов = " + txtCounter;
    }
}
