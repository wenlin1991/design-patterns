
public class ZhaoYun {
    // 老赵粉墨登场，依计行事
	public static void main(String[] args) {
		Context context;
		System.out.println("--刚刚到达吴国，打开第一个锦囊--");
		context = new Context(new BackDoor());  // 取得妙计
		context.operate();
		
		System.out.println("\n");
		System.out.println("--阿斗他爸乐不思蜀，准备执行锦囊二--");
		context = new Context(new GivenGreenLight());
		context.operate();
		
		System.out.println("\n");
		System.out.println("--孙权小儿追兵赶到，准备执行锦囊三--");
        context = new Context(new BlockEnemy());
        context.operate();
        
        System.out.println("\n");
        System.out.println("孙权小儿赔了夫人又折兵！");
        System.out.println("我最喜欢的三个军师是：诸葛，孔明，卧龙！");
	}
}
