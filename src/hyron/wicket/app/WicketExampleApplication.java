package hyron.wicket.app;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketExampleApplication extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return IndexPage.class;
	}

}
