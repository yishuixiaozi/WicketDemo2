package hyron.wicket.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;

public class FormSample extends WebPage{

	public FormSample() {
		super();
		//点用下面一个方法，并且传递相关的参数内容
		
		add(new InputForm("form1"));
		
		
	}

	public static class InputForm extends Form<FormInputModel>{

		public InputForm(String id) {
			super(id , new CompoundPropertyModel<FormInputModel>(new FormInputModel()));
			
			// 添加三个控件
			
			add(new TextField<String>("inputString").setRequired(true).setLabel(new Model<String>()));
            add(new Label("info"));
            add(new Button("saveButton"));
		}

		@Override
		protected void onSubmit() {
			//这里是设置输出信息使用
			FormInputModel model = (FormInputModel) getDefaultModelObject();
            model.setInfo(model.getInputString());
		}

		
		
	}
	
}
