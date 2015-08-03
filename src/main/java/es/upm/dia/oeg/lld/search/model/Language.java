package es.upm.dia.oeg.lld.search.model;

import org.apache.commons.lang3.ArrayUtils;

public class Language {
	
	
	
	public String label;
	public String [] translationLang;
	public String [] indirectLang;
	public String [] pivotLang;
	
	
	public Language(String Label, String [] trans, String [] indtrans,String [] pivtrans){
		label= Label;
		translationLang= ArrayUtils.addAll(new String[]{"All"}, trans);
		indirectLang=indtrans;
		pivotLang= ArrayUtils.addAll(new String[]{"All"}, pivtrans);
	}
	
	public Language(){
		label= new String();
		translationLang= new  String[0];
		indirectLang=new  String[0];
		pivotLang= new  String[0];
	}
	
	
	public String getLabel(){
		return label;
		
	}
	
	public String [] getTranslationLang(){
		return translationLang;
		
	}

	public String[] getIndirectLang() {
		return indirectLang;
	}
	
	public String[] getPivotLang() {
		return pivotLang;
	}
	
	public boolean checkIsIndirect(String langTarget) {
			
		if(langTarget.equals("All")) {return false;}
			
			for(String Indirect: this.indirectLang){
				if (langTarget.equals(Indirect)){
					return true;
				}
			}
					
		return false;
	}
	
	
	

}
