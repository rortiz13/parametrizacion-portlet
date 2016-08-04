package la.ability.parametrizar.util;

import java.util.Map;

public class ModelAndView {

	Map<String, Object> map = null;
	String page="view";
	
	public ModelAndView(String page, Map<String, Object>map)
	{
		this.page = page;
		this.map = map;
	}
	
	public Map<String, Object> getMap() {
		return map;
	}
	
	public String getPage() {
		return page;
	}
}
