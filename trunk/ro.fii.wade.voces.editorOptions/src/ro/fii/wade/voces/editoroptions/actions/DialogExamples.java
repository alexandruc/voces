package ro.fii.wade.voces.editoroptions.actions;
import java.lang.reflect.InvocationTargetException;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import ro.fii.wade.voces.wsconnector.*;

import ro.fii.wade.voces.contentassist.CompletionProposalHelper;

public class DialogExamples extends ApplicationWindow {
	
	 /**
	   * @param parentShell
	   */
	  public DialogExamples(Shell parentShell) {
	    super(parentShell);
	  }

	  /*
	   * (non-Javadoc)
	   * 
	   * @see org.eclipse.jface.window.Window#createContents(org.eclipse.swt.widgets.Composite)
	   */
	  protected Control createContents(Composite parent) {
	   Composite composite = new Composite(parent, SWT.NULL);

	   composite.setLayout(new GridLayout());
	    
	  /*  Shell shell = getShell();
      shell.setText("List Example");
      shell.setSize(200, 200);
       shell.setLayout(new FillLayout(SWT.VERTICAL));
       
       final Label label = new Label(parent, SWT.NONE);
       label.setText(new String("Web Service returned the following vocabularies:"));
       
       final List list = new List(shell, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);

        for (int loopIndex = 0; loopIndex < 20; loopIndex++) {
          list.add("Item " + loopIndex);
        }

        list.addSelectionListener(new SelectionListener() {

          public void widgetSelected(SelectionEvent event) {
            int[] selections = list.getSelectionIndices();
            String outText = "";
            for (int loopIndex = 0; loopIndex < selections.length; loopIndex++)
              outText += selections[loopIndex] + " ";
            System.out.println("You selected: " + outText);
          }

          public void widgetDefaultSelected(SelectionEvent event) {
            int[] selections = list.getSelectionIndices();
            String outText = "";
            for (int loopIndex = 0; loopIndex < selections.length; loopIndex++)
              outText += selections[loopIndex] + " ";
            System.out.println("You selected: " + outText);
          }
        });

        shell.open();
        while (!shell.isDisposed()) {
          if (!shell.getDisplay().readAndDispatch())
        	  shell.getDisplay().sleep();
        }
        shell.getDisplay().dispose();*/
		  String selectedVocab;
		  
		   /*final Display display = new Display();
		    final Shell shell = new Shell(display,SWT.APPLICATION_MODAL);
		    shell.setLayout(new FillLayout());*/
		    
		
		   final Shell shell = getShell();
		  shell.setText("Available vocabularies");
		  shell.setSize(500,300);
	      Label label = new Label (shell, SWT.WRAP);
	      label.setText ("\nThe web service returned the following vocabularies");
	      final List list = new List (shell, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
	      
	      
	      
	      list.setItems (new String [] {"foaf", "doap", "dcmi"});
	      list.addSelectionListener(new SelectionListener() {

	          public void widgetSelected(SelectionEvent event) {
	            int[] selections = list.getSelectionIndices();
	            String outText = "";
	            for (int loopIndex = 0; loopIndex < selections.length; loopIndex++)
	              outText += selections[loopIndex] + " ";
	            System.out.println("You selected: " + outText);
	          }

	          public void widgetDefaultSelected(SelectionEvent event) {
	            int[] selections = list.getSelectionIndices();
	            String outText = "";
	            for (int loopIndex = 0; loopIndex < selections.length; loopIndex++)
	              outText += selections[loopIndex] + " ";
	            System.out.println("You selected: " + outText);
	          }
	        });
	      Button button1 = new Button (shell, SWT.PUSH);
	      button1.setText ("Use selected vocabulary");
	      button1.addListener(SWT.Selection, new Listener() {
	          public void handleEvent(Event event) {
	        	  
				/*MessageDialog.openInformation(shell, "Information", list
						.getSelection()[0]);*/
				// send the option to editor
				
	        	  //WSWorker wsw = new WSWorker();
	        	  //wsw.getVocabularyList();
	        	  CompletionProposalHelper.currentVoc = list.getSelection()[0];
	        	  System.out.println("Changed vocabulary to " + CompletionProposalHelper.currentVoc);
	          }
	        });

	      
	      
	      Button button2 = new Button (shell, SWT.PUSH);
	      button2.setText ("Cancel");
	      
	      button2.addListener(SWT.Selection, new Listener() {
	          public void handleEvent(Event event) {
	        	  close();
	          }
	        });
	      
	      final int insetX = 4, insetY = 4;
	      FormLayout formLayout = new FormLayout ();
	      formLayout.marginWidth = insetX;
	      formLayout.marginHeight = insetY;
	      shell.setLayout (formLayout);
	      
	      Point size = label.computeSize (SWT.DEFAULT, SWT.DEFAULT);
	      final FormData labelData = new FormData (size.x, SWT.DEFAULT);
	      labelData.left = new FormAttachment (0, 0);
	      labelData.right = new FormAttachment (100, 0);
	      label.setLayoutData (labelData);
	      shell.addListener (SWT.Resize, new Listener () {
	        public void handleEvent (Event e) {
	          Rectangle rect = shell.getClientArea ();
	          labelData.width = rect.width - insetX * 2;
	          shell.layout ();
	        }
	      });
	        
	      FormData button2Data = new FormData ();
	      button2Data.right = new FormAttachment (100, -insetX);
	      button2Data.bottom = new FormAttachment (100, 0);
	      button2.setLayoutData (button2Data);
	      
	      FormData button1Data = new FormData ();
	      button1Data.right = new FormAttachment (button2, -insetX);
	      button1Data.bottom = new FormAttachment (100, 0);
	      button1.setLayoutData (button1Data);
	      
	      FormData listData = new FormData ();
	      listData.left = new FormAttachment (0, 0);
	      listData.right = new FormAttachment (100, 0);
	      listData.top = new FormAttachment (label, insetY);
	      listData.bottom = new FormAttachment (button2, -insetY);
	      list.setLayoutData (listData);
	      
	     // shell.pack ();
	     	      
	      shell.open();
	        while (!shell.isDisposed()) {
	          if (!shell.getDisplay().readAndDispatch())
	        	  shell.getDisplay().sleep();
	        }
	        shell.getDisplay().dispose();
	 
	    return super.createContents(parent);
	  }

}
