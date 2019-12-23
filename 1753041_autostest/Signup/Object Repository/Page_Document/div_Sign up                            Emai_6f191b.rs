<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Sign up                            Emai_6f191b</name>
   <tag></tag>
   <elementGuidId>ba8da8df-1820-4d14-b32a-158857854475</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='SIGN UP'])[1]/following::div[1]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>sign-in-box</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
        
            Sign up
            
                Email
                
                Password
                
                First Name
                
                Last Name
                
                
                By signing in, I agree to DDOHA's Terms of Use and Privacy Policy.
                Create Acount
            
        
        
        function validateForm() {
            var x = document.forms[&quot;signup&quot;][&quot;email&quot;].value;
            var y = document.forms[&quot;signup&quot;][&quot;password&quot;].value;
            var z = document.forms[&quot;signup&quot;][&quot;fname&quot;].value;
            var t = document.forms[&quot;signup&quot;][&quot;lname&quot;].value;
            var c = document.forms[&quot;signup&quot;][&quot;checkbox&quot;].checked;

            if (x == &quot;&quot;) {
                alert(&quot;Email must be filled out&quot;);
                return false;
            }
            if (y == &quot;&quot;) {
                alert(&quot;Password must be filled out&quot;);
                return false;
            }
            if (z == &quot;&quot;) {
                alert(&quot;First name must be filled out&quot;);
                return false;
            }
            if (t == &quot;&quot;) {
                alert(&quot;Lastname must be filled out&quot;);
                return false;
            }
            if (c == false) {
                alert(&quot;Checkbox must be checked&quot;);
                return false;
            }
            if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(x)==false) {
                alert(&quot;You have entered an invalid email address!&quot;)
                return (false)
            }
            if (/^[A-Za-z]\w{7,15}$/.test(y)==false) {
                alert(&quot;Password between 8 to 16 characters which contain only characters, numeric digits, underscore and first character must be a letter&quot;)
                return (false)
            }
        }
        
    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;sign-in-box&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='SIGN UP'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='SIGN IN'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]</value>
   </webElementXpaths>
</WebElementEntity>
