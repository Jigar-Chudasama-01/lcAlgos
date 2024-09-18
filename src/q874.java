//public class q874 {
//    public static void main(String[] args) {
//        int[] arr = {6, -1, -1, 6};
//        int[][] obs = {};
//        System.out.println(robotSim(arr, obs));
//    }
//
//    static int robotSim(int[] cmd, int[][] obs) {
//        int x = 0;
//        int y = 0;
//        int ret = Integer.MIN_VALUE;
//        int index = 0;
//        char ch = 'n';
//        for (int i = 0; i < cmd.length; i++) {
//            if (cmd[i] == -1) {
//                if (ch == 'n') {
//                    ch = 'e';
//                } else if (ch == 'e') {
//                    ch = 's';
//                } else if (ch == 's') {
//                    ch = 'w';
//                } else {
//                    ch = 'n';
//                }
//            } else if (cmd[i] == -2) {
//                if (ch == 'n') {
//                    ch = 'w';
//                } else if (ch == 'e') {
//                    ch = 'n';
//                } else if (ch == 's') {
//                    ch = 'e';
//                } else {
//                    ch = 's';
//                }
//            } else {
//                if (ch == 'n' || ch == 's') {
//                    if (index < obs.length && x == obs[index][0]) {
//                        if (ch == 'n') {
//                            y += obs[index++][1] - 1;
//                        } else {
//                            y -= obs[index++][1] - 1;
//                        }
//                    } else {
//                        if (ch == 'n') {
//                            y += cmd[i];
//                        } else {
//                            y -= cmd[i];
//                        }
//                    }
//                } else {
//                    if (index < obs.length && y == obs[index][1]) {
//                        if (ch == 'e') {
//                            x += obs[index++][0] - 1;
//                        } else {
//                            x -= obs[index++][0] - 1;
//                        }
//                    } else {
//                        if (ch == 'e') {
//                            x += cmd[i];
//                        } else {
//                            x -= cmd[i];
//                        }
//                    }
//                }
//                ret = Math.max(ret, x * x + y * y);
//            }
//        }
//        return ret;
//    }
//}
