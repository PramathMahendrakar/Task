package com.pra.spring.files;

public class Monitor {

	private int width;
	private int height;

	private String model_no;
	private String mfg_date;

	public Monitor(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Monitor() {

		System.out.println("Created\t".getClass().getSimpleName());

	}

	public String getModel_no() {
		return model_no;
	}

	public void setModel_no(String model_no) {
		this.model_no = model_no;
	}

	public String getMfg_date() {
		return mfg_date;
	}

	public void setMfg_date(String mfg_date) {
		this.mfg_date = mfg_date;
	}
	
	public void showdata()
	{
		System.out.println("Width\t"+width);
		System.out.println("Height\t"+height);
		
	}
	
}
