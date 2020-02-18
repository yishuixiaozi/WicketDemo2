package hyron.wicket.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public class IndexPage extends WebPage{

	public IndexPage() {
		super();
		
		add(new Link<String> ("ink1") {

			@Override
			public void onClick() {
				// 这个链接点击之后会跳向另外一个链接
				setResponsePage(FormSample.class);
			}
			
		});
		
	}
}
