/*(C) 2007-2012 Alibaba Group Holding Limited.	

public class TDLCheckedExcption extends Exception{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1186363001286203116L;
	public TDLCheckedExcption() {
		super();
	}
	public TDLCheckedExcption(Throwable throwable){
		super(throwable);
	}
    public TDLCheckedExcption(String message, Throwable cause) {
        super(message, cause);
    }
	public TDLCheckedExcption(String arg) {
		super(arg);
	}
}