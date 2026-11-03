package ae.mastercoastautos.v87;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
public final class MainActivity extends Activity {
 private static final String URL = "https://master-coast-autos-v87.desilvaautohub.workers.dev";
 @Override public void onCreate(Bundle state) { super.onCreate(state); Uri uri=Uri.parse(URL); try {new CustomTabsIntent.Builder().setShowTitle(false).build().launchUrl(this,uri);} catch(Exception e){startActivity(new Intent(Intent.ACTION_VIEW,uri));} finish(); }
}
