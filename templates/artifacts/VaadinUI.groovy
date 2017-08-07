@artifact.package@

import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Alignment
import com.vaadin.ui.Button
import com.vaadin.ui.HorizontalLayout
import com.vaadin.ui.Notification
import com.vaadin.ui.UI

@SpringUI(path="/"+@artifact.name@UI)
public class @artifact.name@GrailsUI extends UI{
    @Override
    protected void init(VaadinRequest request) {
        HorizontalLayout root = new HorizontalLayout()
        root.setSizeFull()

        Button button = new Button("Click me!", {
            Notification.show("Hello from Vaadin 8 + Grails 3!", Notification.Type.ERROR_MESSAGE)
        } as Button.ClickListener)
        root.addComponent(button)

        root.setComponentAlignment(button, Alignment.MIDDLE_CENTER)

        setContent(root)
    }
}