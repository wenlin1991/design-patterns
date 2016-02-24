/* Context.java */
public class Context {
    // 构造函数，你要使用哪个妙计
	private IStrategy strategy;
	
	public Context (IStrategy strategy){
		this.strategy = strategy;
	}
	
	// 看我出大招
	public void operate() {
		strategy.operate();
	}
}
