public class game{
    public static void main(String[] args) {
        Role p1 = new Role("远野", 11451, 4);
        Role p2 = new Role("先辈", 19198, 10);
        int x=0;//记录回合数
        System.out.println("游戏开始,"+p1.getName()+"与"+p2.getName()+"的撅斗开始了");
        System.out.println(p2.getName()+"看起来有十分甚至九分的把握赢");
        while (true) {
            p1.attack(p2);
            if (p2.getHp() == 0) {
                System.out.println("哼哼哼啊啊啊啊啊啊~"+p1.getName() + "胜利");
                break;
            }
            p2.attack(p1);
            if (p1.getHp() == 0) {
                System.out.println("哼哼哼啊啊啊啊啊啊~"+p2.getName() + "胜利");
                break;
            }
            x++;
            System.out.println("战况十分激烈呢(心虚),"+"已经进入第"+x+"回合了！");
        }
        System.out.println("胜利了有奖励,失败了有惩罚(悲)");

    }
}
