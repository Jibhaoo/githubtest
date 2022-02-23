import javax.sound.midi.ShortMessage;

import org.openqa.jetty.html.Input;

import com.thoughtworks.selenium.condition.ConditionRunner.Context;

public class IncomingSmsCapture extends BroadcastReceiver {
@Override
public void onReceive(Context context, Input intent) {
Bundle bundle = ((Object) intent).getExtras();       
ShortMessage[] msgs = null;
String data = "";           
if (bundle != null)
{
    Object[] pdus = (Object[]) bundle.get("pdus");
    msgs = new SmsMessage[pdus.length];           
    for (int i=0; i<msgs.length; i++){
    msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);               
    String sender = msgs[i].getOriginatingAddress();      
    data = msgs[i].getMessageBody().toString(); 
    // parse the data and extract the location, then convert to an Address using the GeoCoder. 
}    }   }   }