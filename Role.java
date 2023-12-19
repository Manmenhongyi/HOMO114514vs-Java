public class Role {
    private int hp;
    //定义体力值
    private String name;
    //定义角色名
    private int a;
    //定义攻击值
    public Role(String name,int hp,int a)
    {
        this.name=name;
        this.hp=hp;
        this.a=a;
    }
    public String getName()
    {
        return name;//返回name值
    }

    public int getHp()
    {
        return hp;//返回hp值
    }
    public void setHp(int hp)
    {
        this.hp=hp;//设置hp值
    }
    public int getA()
    {
        return a;//返回攻击力
    }
    public void attack(Role Role)
        {
        int k=Role.getHp()- this.a;//定义计算剩余血量
            //判断剩余血量是否已经低于0并输出
            Role.setHp(Math.max(k, 0));
        System.out.println(this.name+"撅了"+Role.getName()+","+Role.getName()+"剩余血量"+Role.getHp());
        }
    }
