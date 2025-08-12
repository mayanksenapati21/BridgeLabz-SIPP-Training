import java.io.*;

public class BufferedVsUnbufferedCopy {
    public static void main(String[] args) throws IOException {
        String source = "largefile.dat";
        String destBuffered = "copy_buffered.dat";
        String destUnbuffered = "copy_unbuffered.dat";

        long start, end;

        start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destUnbuffered)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        end = System.nanoTime();
        System.out.println("Unbuffered copy time: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destBuffered))) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        end = System.nanoTime();
        System.out.println("Buffered copy time: " + (end - start) / 1_000_000 + " ms");
    }
}
