<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_Customer Portal Dashboard</name>
   <tag></tag>
   <elementGuidId>a445bc32-d75a-4833-b613-b9a3b6eded47</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//html</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>lang</name>
      <type>Main</type>
      <value>en</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value> js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache svg inlinesvg smil svgclippaths</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
	
	
	
	
	Customer Portal Dashboard

	
	
	


	
    

#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}

    
        


   
       
           
               
                   Toggle navigation
                   
                   
                   
               

               
           

           
           
                   
                       QA
                   

               
                           
                               Reporting
                               
                                       Reports
                                       Report Repository
                               
                           
                           
                               Assets
                               
                                       Car Information Search
                                       Shop Forms
                               
                           
                           
                               Help
                               
                                       About Enspire
                                       Landing Page
                                       About Entrust
                               
                           
               
               
                   GMS/customer.portal
                   
                   Logout
               

           
       
   

        
        
            



    
        
            
                
                    Asset Search
                        Car Specifications Search
                    
                
                
    
        
            
                Asset Mark
                
                    
                    
                        
                    
                
            
        
        


            
            
    
        Out of Service Assets
    
    

    Arrived
: 1Enroute
: 4Estimated
: 1Invoiced
: 1Arrived
: 1Enroute
: 4Estimated
: 1Invoiced
: 1Arrived
: 1Enroute
: 4Estimated
: 1Invoiced
: 1

        
Cars Enroute4Car Arrived1Car Estimated1Car Invoiced1All Out Of Service Cars7        



        
        
            

    
        Reports
            View All Reports
        
    
        
                
                    Asset Group Cost Dashboard
                    
                        
                            Summarizes cost breakdown by Asset Group
                        
                    
                
                
                    Estimate And Rebill Details Per Car
                    
                        
                            Report that is a representation of all the details for a repair event
                        
                    
                
                
                    Test New BI Integration
                    
                        
                            
                        
                    
                
        

            
                
                    Invoices
                
                    
        
            
                Invoice Number
                Billed Party
                Invoice Date
                Invoice Total
                Artifacts
            
        
        
                
                    754196
                    BNSF
                    03/09/2017
                            $2,707.17

                    
                            
                                                    
                    
                
                
                    747265
                    BNSF
                    03/25/2016
                            0

                    
                            
                                                    
                    
                
                
                    747267
                    BNSF
                    03/25/2016
                            ($1,686.97)

                    
                            
                                                    
                    
                
                
                    747253
                    BNSF
                    03/24/2016
                            $4,995.03

                    
                            
                                                    
                    
                
                
                    732608
                    BNSF
                    06/12/2015
                            $38.43

                    
                            
                                                    
                    
                
                
                    726399
                    BNSF
                    04/08/2015
                            $3,530.48

                    
                            
                                                    
                    
                
        
    

            
        
    


    div.dc-chart {
        float: none;
    }
    .dc-chart g.row text {
        fill: black;
    }
    .dc-chart .pie-slice {
        fill: black;
    }


        
        
            Copyright © The Greenbrier Companies
        
    
    
        
            
                
                Processing
            
        
    

    

    

    
        var AppRootURL = '/AssetManagement/'.slice(0, -1);
    
    
     
     
     
     
     

    
    function onResize() {
        if ('True' == 'True')
            $('body').css('padding-top', $('#MenuBar').height());
        else
            $('body').css('padding-top', 15);
    };

    // attach the function to the window resize event
    $(window).resize(onResize);

    onResize();

    function setHomePage() {
        $.ajax({
            url: &quot;/Account/SetHomePage&quot;,
            type: 'POST',
            data: { &quot;url&quot;: window.location.href },
            success: function() {
                // Update URL for home button
                $(&quot;#hpi&quot;).attr(&quot;href&quot;, window.location.href);
                // Update Home page menu item
                updateHomeLink();
            }
        });
    }

    function updateHomeLink() {
        if (window.location.href == $(&quot;#hpi&quot;).attr(&quot;href&quot;))
            $(&quot;#hpl&quot;).addClass(&quot;text-primary&quot;);
        else
            $(&quot;#hpl&quot;).removeClass(&quot;text-primary&quot;);
    }

    updateHomeLink();

    

body.tablesorter-disableSelection { -ms-user-select: none; -moz-user-select: -moz-none;-khtml-user-select: none; -webkit-user-select: none; user-select: none; }.tablesorter-resizable-container { position: relative; height: 1px; }.tablesorter-resizable-handle { position: absolute; display: inline-block; width: 8px;top: 1px; cursor: ew-resize; z-index: 3; user-select: none; -moz-user-select: none; }/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache svg inlinesvg smil svgclippaths&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;js flexbox flexboxlegacy canvas canvastext webgl no-touch geolocation postmessage websqldatabase indexeddb hashchange history draganddrop websockets rgba hsla multiplebgs backgroundsize borderimage borderradius boxshadow textshadow opacity cssanimations csscolumns cssgradients cssreflections csstransforms csstransforms3d csstransitions fontface generatedcontent video audio localstorage sessionstorage webworkers no-applicationcache svg inlinesvg smil svgclippaths&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
