package com.qinghuaIT3;

public class Jsj {

	 Cpu cpu;
	    Ems ems;
	    HardDisk harddisk;
	     public void setCpu(Cpu cpu) {
	            this.cpu = cpu;
	        }
	    public void setEms(Ems ems){
	        this.ems=ems;
	    }


	    public void steHardDisk(HardDisk harddisk){
	        this.harddisk=harddisk;
	        }
	    public void print(){
	    	System.out.println("Cpu��Ʒ���ǣ�"+cpu.getPp()+",��Ƶ�ǣ�"+cpu.getZp());
	    	System.out.println("Ӳ��������"+harddisk.getRl());
	    	System.out.println("�ڴ�������"+ems.getRl1());
	    }
}
