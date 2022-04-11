package iosample;

import java.io.File;
import java.util.Date;

public class FileSample {
    public static void main(String[] args) {
        FileSample fileSample = new FileSample();
        String pathName = "C:\\godofjava\\text";
        fileSample.checkPath(pathName);
        fileSample.makeDir(pathName);
        fileSample.checkFileMethods(pathName);
        fileSample.canFileMethods(pathName);
        fileSample.lastModified(pathName);
    }

    private void checkPath(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is exists? = " + file.exists());
    }

    private void makeDir(String pathName) {
        File file = new File(pathName);
        System.out.println("Make " + pathName + " result = " + file.mkdir());
    }

    private void checkFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " is directory? = " + file.isDirectory());
        System.out.println(pathName + " is file? = " + file.isFile());
        System.out.println(pathName + " is hidden? = " + file.isHidden());
    }

    private void canFileMethods(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " can read? = " + file.canRead());
        System.out.println(pathName + " can write? = " + file.canWrite());
        System.out.println(pathName + " can execute? = " + file.canExecute());

    }

    private void lastModified(String pathName) {
        File file = new File(pathName);
        System.out.println(pathName + " last modified = " + new Date(file.lastModified()));
    }
}
