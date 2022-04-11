package serializablesample;

import java.io.*;

import static java.io.File.separator;

public class ManageObject {
    public static void main(String[] args) {
        ManageObject manager = new ManageObject();
        String fullPath = separator + "godofJava" + separator + "text" + separator + "serial.obj";
        SerialDTO dto = new SerialDTO("GodOfJavaBook", 1, true, 100);
        manager.saveObject(fullPath, dto);
        manager.loadObject(fullPath);
    }

    private void saveObject(String fullPath, SerialDTO dto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fullPath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dto);
            System.out.println("Write success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void loadObject(String fullPath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            SerialDTO dto = (SerialDTO) obj;
            System.out.println(dto);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
