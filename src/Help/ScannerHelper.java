package Help;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerHelper {
    public static ScannerHelper sh;

    static {
        sh = new ScannerHelper();
    }

    /**
     * 获取用户输入
     *
     * @param isLoop boolean型，true为提示一直输入确保用户输入的为合理值，false返回-1
     * @return
     */
    public int getScanner(boolean isLoop) {
        Scanner sc = new Scanner(System.in);

        int i = -1;
        try {
            i = sc.nextInt();
        } catch (InputMismatchException e) {
            if (isLoop) {
                System.out.println("请输入合理的整数！");
                i = getScanner(true);
            }
        }
        return i;
    }
}
