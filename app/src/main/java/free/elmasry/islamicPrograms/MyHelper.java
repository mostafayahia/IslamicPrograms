/*
 * Copyright (C) 2018 Yahia H. El-Tayeb
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package free.elmasry.islamicPrograms;


import java.util.HashMap;

import android.content.Context;
import android.widget.Toast;

public class MyHelper {

    // mapping the list view item index to the program name
    static final HashMap<String, String> PROGRAM_AR_EN_MAP = new HashMap<String, String>();

    // mapping program name to its section
    static final HashMap<String, String> PROGRAM_SECTION_MAP = new HashMap<String, String>();


    // =================== READ ME (VERY IMPORTAN) =======================
    /*
     * this application logic is designed such that you mustn't change any value of *_NAME_EN_* variables
     * SO BE VERY CAREFUL ABOUT THAT
     * BUT you can change the value of any *_NAME_AR_* variables to correct any typo appears to the user
     * without causing bugs in the application
     */

    // ANY CHANGING IN THESE VARIABLES' VALUES MUST HAVE CORRESPONDING CHANGING IN
    // STRINGS.XML -> programNames
    // Arabic programs names' variables
    // TODO (3) add program name in arabic and should match the arabic name in TODO (2)
    private static final String PROGRAM_NAME_AR_THOUGHTS_SURA_YUSUF = "سورة يوسف";
    private static final String PROGRAM_NAME_AR_AGE_HARVEST = "حصاد العمر";
    private static final String PROGRAM_NAME_AR_THOUGHTS_SURA_YA_SEEN = "سورة يس";
    private static final String PROGRAM_NAME_AR_CONFUSED = "حائر";
    private static final String PROGRAM_NAME_AR_BIOGRAPHY_IS_LIFE = "السيرة حياة";
    private static final String PROGRAM_NAME_AR_LIVE_THE_MOMENT = "عيش اللحظة";
    private static final String PROGRAM_NAME_AR_NEW_PERSON = "إنسان جديد";
    private static final String PROGRAM_NAME_AR_REFLECTIONS_10 = "خواطر 10";
    private static final String PROGRAM_NAME_AR_REFLECTIONS_11 = "خواطر 11";
    private static final String PROGRAM_NAME_AR_FAITH_AND_ERA = "الإيمان والعصر";
    private static final String PROGRAM_NAME_AR_OMAR_SERIES = "مسلسل عمر";
    private static final String PROGRAM_NAME_AR_THINK = "فكر 1";
    private static final String PROGRAM_NAME_AR_LIFE_ROAD = "الإيمان والعصر - طريق الحياة";
    private static final String PROGRAM_NAME_AR_LIFE_ART = "فن الحياة";
    private static final String PROGRAM_NAME_AR_PILGRIMAGE = "نفسي أحج";
    private static final String PROGRAM_NAME_AR_THOUGHTS_SURA_ALTAWBA = "سورة التوبة";
    private static final String PROGRAM_NAME_AR_THOUGHTS_SURA_ALKAHF = "سورة الكهف";
    private static final String PROGRAM_NAME_AR_THOUGHTS_SURA_ALNOUR = "سورة النور";
    private static final String PROGRAM_NAME_AR_THOUGHTS_SURA_ALDOKHAN = "سورة الدخان";
    private static final String PROGRAM_NAME_AR_THINK_2 = "فكر 2";
    private static final String PROGRAM_NAME_AR_MESSAGE_FROM_GOD = "رسالة من الله";
    private static final String PROGRAM_NAME_AR_PROPHET_OF_MERCY = "نبي الرحمة والتسامح";
    private static final String PROGRAM_NAME_AR_MAGIC = "السحر";

    // ==== WE PUT underscore AT THE END OF THE STRING VALUE TO INDICATE THAT IT CAN BE CONCATENATED ====
    // ===== DON'T MODIFY ====
    // English programs names' variables
    // TODO (4) add program name in english
    static final String PROGRAM_NAME_EN_THOUGHTS_SURA_YUSUF = "thoughts_sura_yusuf";
    static final String PROGRAM_NAME_EN_AGE_HARVEST = "age_harvest_";
    static final String PROGRAM_NAME_EN_THOUGHTS_SURA_YA_SEEN = "thoughts_sura_ya_seen_";
    static final String PROGRAM_NAME_EN_CONFUSED = "confused_";
    static final String PROGRAM_NAME_EN_BIOGRAPHY_IS_LIFE = "biography_is_life_";
    static final String PROGRAM_NAME_EN_LIVE_THE_MOMENT = "live_the_moment_";
    static final String PROGRAM_NAME_EN_NEW_PERSON = "new_person_";
    static final String PROGRAM_NAME_EN_REFLECTIONS_10 = "reflections_10_";
    static final String PROGRAM_NAME_EN_REFLECTIONS_11 = "reflections_11_";
    static final String PROGRAM_NAME_EN_FAITH_AND_ERA = "faith_and_era_";
    static final String PROGRAM_NAME_EN_OMAR_SERIES = "omar_series_";
    static final String PROGRAM_NAME_EN_THINK = "think_";
    static final String PROGRAM_NAME_EN_LIFE_ROAD = "life_road_";
    static final String PROGRAM_NAME_EN_LIFE_ART = "life_art_";
    static final String PROGRAM_NAME_EN_PILGRIMAGE = "pilgrimage_";
    static final String PROGRAM_NAME_EN_THOUGHTS_SURA_ALTAWBA = "thoughts_sura_altawba_";
    static final String PROGRAM_NAME_EN_THOUGHTS_SURA_ALKAHF = "thoughts_sura_alkahf_";
    static final String PROGRAM_NAME_EN_THOUGHTS_SURA_ALNOUR = "thoughts_sura_alnour_";
    static final String PROGRAM_NAME_EN_THOUGHTS_SURA_ALDOKHAN = "thoughts_sura_aldokhan_";
    static final String PROGRAM_NAME_EN_THINK_2 = "think_2_";
    static final String PROGRAM_NAME_EN_MESSAGE_FROM_GOD = "message_from_god_";
    static final String PROGRAM_NAME_EN_PROPHET_OF_MERCY = "prophet_of_mercy_";
    static final String PROGRAM_NAME_EN_MAGIC = "magic_";

    // ==== DON'T MODIFY ====
    // sections' variable
    // TODO (1) (IF NECESSARY) add a new section
    static final String SECTION_NAME_EN_AMR_KHALED = "amr_khaled_";
    static final String SECTION_NAME_EN_MOSTAFA_HOSNY = "mostafa_hosny_";
    static final String SECTION_NAME_EN_MISCELLANEOUS = "miscellaneous_";
    static final String SECTION_NAME_EN_AHMED_ELSHAKERY = "ahmed_elshakery_";
    static final String SECTION_NAME_EN_ALSHAARAWY = "alshaarawy_";

    // === DON'T MODIFY =====
    static final String STR_LAST_WATCHED_EPISODE = "last_watched_episode_in_";
    static final String STR_LAST_WATCHED_PROGRAM = "last_watched_program";
    // we choose this preferences file name to be compatible with the preferences file name
    // before version 1.3
    static final String STR_PREFS_FILE_NAME = "IslamicProgramsActivity";

    // begin the title for the section with this symbol
    private static final String SYMBOL_TITLE = "—";

    // run just when the class is referenced
    static {
        // fill porgramArEnMap with the data
        fillProgramArEnMap();

        // fill programSectionMap with the data
        fillProgramSectionMap();

    }


    // ==== PLEASE DON'T MODIFY ======

    /**
     * fill programSectionMap with the data
     */
    private static void fillProgramSectionMap() {
        // TODO (5) add the program to a certain section
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_YUSUF, SECTION_NAME_EN_ALSHAARAWY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_AGE_HARVEST, SECTION_NAME_EN_MISCELLANEOUS);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_YA_SEEN, SECTION_NAME_EN_ALSHAARAWY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_LIVE_THE_MOMENT, SECTION_NAME_EN_MOSTAFA_HOSNY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_NEW_PERSON, SECTION_NAME_EN_MOSTAFA_HOSNY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_REFLECTIONS_10, SECTION_NAME_EN_AHMED_ELSHAKERY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_REFLECTIONS_11, SECTION_NAME_EN_AHMED_ELSHAKERY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_FAITH_AND_ERA, SECTION_NAME_EN_AMR_KHALED);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_OMAR_SERIES, SECTION_NAME_EN_MISCELLANEOUS);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THINK, SECTION_NAME_EN_MOSTAFA_HOSNY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_LIFE_ART, SECTION_NAME_EN_MOSTAFA_HOSNY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_LIFE_ROAD, SECTION_NAME_EN_AMR_KHALED);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_PILGRIMAGE, SECTION_NAME_EN_AMR_KHALED);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALTAWBA, SECTION_NAME_EN_ALSHAARAWY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALKAHF, SECTION_NAME_EN_ALSHAARAWY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALNOUR, SECTION_NAME_EN_ALSHAARAWY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALDOKHAN, SECTION_NAME_EN_ALSHAARAWY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_THINK_2, SECTION_NAME_EN_MOSTAFA_HOSNY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_MESSAGE_FROM_GOD, SECTION_NAME_EN_MOSTAFA_HOSNY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_PROPHET_OF_MERCY, SECTION_NAME_EN_AMR_KHALED);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_MAGIC, SECTION_NAME_EN_MISCELLANEOUS);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_CONFUSED, SECTION_NAME_EN_MOSTAFA_HOSNY);
        PROGRAM_SECTION_MAP.put(PROGRAM_NAME_AR_BIOGRAPHY_IS_LIFE, SECTION_NAME_EN_AMR_KHALED);
    }

    // ========= PLEASE DON'T MODIFY ==========

    /**
     * fill indexProgramMap with their entries
     */
    private static void fillProgramArEnMap() {
        // TODO (6) map the arabic and english name of the program
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_YUSUF, PROGRAM_NAME_EN_THOUGHTS_SURA_YUSUF);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_AGE_HARVEST, PROGRAM_NAME_EN_AGE_HARVEST);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_YA_SEEN, PROGRAM_NAME_EN_THOUGHTS_SURA_YA_SEEN);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_LIVE_THE_MOMENT, PROGRAM_NAME_EN_LIVE_THE_MOMENT);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_NEW_PERSON, PROGRAM_NAME_EN_NEW_PERSON);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_REFLECTIONS_10, PROGRAM_NAME_EN_REFLECTIONS_10);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_REFLECTIONS_11, PROGRAM_NAME_EN_REFLECTIONS_11);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_FAITH_AND_ERA, PROGRAM_NAME_EN_FAITH_AND_ERA);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_OMAR_SERIES, PROGRAM_NAME_EN_OMAR_SERIES);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THINK, PROGRAM_NAME_EN_THINK);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_LIFE_ART, PROGRAM_NAME_EN_LIFE_ART);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_LIFE_ROAD, PROGRAM_NAME_EN_LIFE_ROAD);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_PILGRIMAGE, PROGRAM_NAME_EN_PILGRIMAGE);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALTAWBA, PROGRAM_NAME_EN_THOUGHTS_SURA_ALTAWBA);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALKAHF, PROGRAM_NAME_EN_THOUGHTS_SURA_ALKAHF);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALNOUR, PROGRAM_NAME_EN_THOUGHTS_SURA_ALNOUR);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THOUGHTS_SURA_ALDOKHAN, PROGRAM_NAME_EN_THOUGHTS_SURA_ALDOKHAN);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_THINK_2, PROGRAM_NAME_EN_THINK_2);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_MESSAGE_FROM_GOD, PROGRAM_NAME_EN_MESSAGE_FROM_GOD);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_PROPHET_OF_MERCY, PROGRAM_NAME_EN_PROPHET_OF_MERCY);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_MAGIC, PROGRAM_NAME_EN_MAGIC);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_CONFUSED, PROGRAM_NAME_EN_CONFUSED);
        PROGRAM_AR_EN_MAP.put(PROGRAM_NAME_AR_BIOGRAPHY_IS_LIFE, PROGRAM_NAME_EN_BIOGRAPHY_IS_LIFE);

    }

    // =============== PLEASE DON'T MODIFY =============

    /**
     * getting the program episodes' links based on Arabic program name
     */
    static String[] getEpisodesLinks(String arProgramName) {
        // TODO (8) add the episodes' links of the program in this method
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_YUSUF))
            return new String[]{
                    "https://www.youtube.com/watch?v=mqODaIdP4lM&list=PLD40D68F97CE58214&index=2&t=0s",
                    "https://www.youtube.com/watch?v=jNwys_hj6_Y&list=PLD40D68F97CE58214&index=3&t=0s",
                    "https://www.youtube.com/watch?v=h6othGGCIdU",
                    "https://www.youtube.com/watch?v=SNY48WsOMW0&list=PLD40D68F97CE58214&index=4&t=0s",
                    "https://www.youtube.com/watch?v=VhCYNcEaZFg&list=PLD40D68F97CE58214&index=5&t=0s",
                    "https://www.youtube.com/watch?v=FSzt9lYMDRk&list=PLD40D68F97CE58214&index=6&t=0s",
                    "https://www.youtube.com/watch?v=dCeXhgcQoKg&list=PLD40D68F97CE58214&index=7&t=0s",
                    "https://www.youtube.com/watch?v=NAiWIa-LVyo&list=PLD40D68F97CE58214&index=8&t=0s",
                    "https://www.youtube.com/watch?v=K_Z1dB4EhZM&list=PLD40D68F97CE58214&index=9&t=0s",
                    "https://www.youtube.com/watch?v=7VUNbfGu3wo&list=PLD40D68F97CE58214&index=10&t=0s",
                    "https://www.youtube.com/watch?v=EHcPTeHCNEU&list=PLD40D68F97CE58214&index=11&t=0s",
                    "https://www.youtube.com/watch?v=c3QSS9JoO_c&list=PLD40D68F97CE58214&index=12&t=0s",
                    "https://www.youtube.com/watch?v=n65NRnZZvOs&list=PLD40D68F97CE58214&index=13&t=0s",
                    "https://www.youtube.com/watch?v=XL42USGGNjY&list=PLD40D68F97CE58214&index=14&t=0s"

            };
        if (arProgramName.equals(PROGRAM_NAME_AR_AGE_HARVEST))
            return new String[]{
                    "https://www.youtube.com/watch?v=w5F9WGRKbLw&index=3&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=gqAX1lfdTCA&index=4&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=6s",
                    "https://www.youtube.com/watch?v=Pr0misjMkfI&index=5&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=2s",
                    "https://www.youtube.com/watch?v=53Qba9X6cLc&index=6&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=SuyR-5QpK8k&index=7&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=XykoOfuygjs&index=8&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=5s",
                    "https://www.youtube.com/watch?v=25mPCY0Wjy4&index=9&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=iq8I2xJ-NKA&index=10&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=dAAdJm4Amjg&index=11&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=H-Pc5FcV-1s&index=12&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=1s",
                    "https://www.youtube.com/watch?v=0X_Nap5E5bY&index=13&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=r2SyoZQ0AN0&index=14&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=Vs3r19kcRNQ&index=15&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=5s",
                    "https://www.youtube.com/watch?v=twC1DR4Y-N0&index=16&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=dbdEcKs5TpY&index=17&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=U5O2vUPUwAU&index=18&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=13s",
                    "https://www.youtube.com/watch?v=eRB9h2px-9c&index=19&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=ll_HCbE5toU&index=20&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=nGAyfqveGjs&index=21&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=IN__89LiPjg&index=22&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=Hoh3Nwm1Q0c&index=23&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=e0X4CZqvKV4&index=24&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=Nmrf-6rnNK4&index=25&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=HywJSr_oilI&index=26&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=43oeQj1tiL0&index=27&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=iflSVeeiZXs&index=28&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=E80b47iPIoo&index=29&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=59s",
                    "https://www.youtube.com/watch?v=KjoC0HTBmQo&index=30&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=dYobzSj9zWk&index=31&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s",
                    "https://www.youtube.com/watch?v=X8j6VLwJdVg&index=32&list=PLATlJNRzYr-Cr9kaSF0EAqFNBBeGeju71&t=0s"
            };
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_YA_SEEN))
            return new String[]{
                    "https://www.youtube.com/watch?v=pAO8GtMeOgs&index=2&t=3s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=XRXcZRusjlY&index=3&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=AzHgYGUjQnU&index=4&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=F8NAMTrwyr8&index=5&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=rMwVLSnlDtA&index=6&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=62E5BMVbWdI&index=7&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=j4WDkA8lnoA&index=8&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=PJu1SrADt68&index=9&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=4SXa3actwQM&index=10&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=AdSz9wFEcoQ&index=11&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=fHsHeGzz_Og&index=12&t=0s&list=PL7AFA891E979C3874",
                    "https://www.youtube.com/watch?v=qepJ6ITUCL0&index=13&t=0s&list=PL7AFA891E979C3874"
            };
        if (arProgramName.equals(PROGRAM_NAME_AR_CONFUSED))
            return new String[]{
                    "https://www.youtube.com/watch?v=s-y_r_JFZsI&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=30&t=0s",
                    "https://www.youtube.com/watch?v=63ZLHGQmDnU&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=29&t=0s",
                    "https://www.youtube.com/watch?v=adHUS0dwFB4&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=28&t=0s",
                    "https://www.youtube.com/watch?v=pfVLrJSBAmk&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=27&t=0s",
                    "https://www.youtube.com/watch?v=hVopKlBOGp4&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=26&t=0s",
                    "https://www.youtube.com/watch?v=3H1ra6MaqiA&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=25&t=0s",
                    "https://www.youtube.com/watch?v=mgSvwTxVPig&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=24&t=0s",
                    "https://www.youtube.com/watch?v=hieUtdsgRFY&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=23&t=0s",
                    "https://www.youtube.com/watch?v=sBVRDv_UCV8&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=22&t=0s",
                    "https://www.youtube.com/watch?v=U2BuJbTQ-uY&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=21&t=0s",
                    "https://www.youtube.com/watch?v=MFtHCUL7o-0&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=20&t=0s",
                    "https://www.youtube.com/watch?v=CfDKCQnVvDA&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=19&t=0s",
                    "https://www.youtube.com/watch?v=1AnOcbLh57A&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=18&t=0s",
                    "https://www.youtube.com/watch?v=W0qWy1Sp_Bg&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=17&t=0s",
                    "https://www.youtube.com/watch?v=4vCOPjt_7zE&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=16&t=0s",
                    "https://www.youtube.com/watch?v=nEzeHnOdTS8&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=15&t=0s",
                    "https://www.youtube.com/watch?v=erwd_seLSc0&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=14&t=0s",
                    "https://www.youtube.com/watch?v=FrxAK_KWuaY&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=13&t=0s",
                    "https://www.youtube.com/watch?v=lJ5F4yit3E0&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=12&t=0s",
                    "https://www.youtube.com/watch?v=17WmQ-QJJZs&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=11&t=0s",
                    "https://www.youtube.com/watch?v=DBvO1p8wf-k&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=10&t=0s",
                    "https://www.youtube.com/watch?v=skjrm9hkjxc&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=9&t=0s",
                    "https://www.youtube.com/watch?v=FrtE6yab_Gw&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=8&t=0s",
                    "https://www.youtube.com/watch?v=gNjn369Lgcg&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=7&t=0s",
                    "https://www.youtube.com/watch?v=molMyj8pSeY&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=6&t=0s",
                    "https://www.youtube.com/watch?v=5O_XeMWM_Zg&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=5&t=0s",
                    "https://www.youtube.com/watch?v=QkfqPCXWEg4&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=4&t=0s",
                    "https://www.youtube.com/watch?v=jOIzGGUbH2I&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=3&t=0s",
                    "https://www.youtube.com/watch?v=9T_EI4Md0VM&list=PLiJggHtOlnN1vsEZC0PXAeh-qBIfKynoH&index=2&t=0s"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_BIOGRAPHY_IS_LIFE))
            return new String[]{
                    "https://www.youtube.com/watch?v=VhyTBRZKZmU&t=0s&index=6&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=G67ftFF5Dpk&t=0s&index=7&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=4npVahPfkzc&t=0s&index=8&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=UcXnlotoKQ0&t=0s&index=9&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=CLpJEtupUgc&t=0s&index=10&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=V8P0SMTd_3Q&t=0s&index=11&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=Hb5SPLtK_mM&t=0s&index=12&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=DoFEfbjfTa8&t=0s&index=13&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=4_hojxrhcDs&t=0s&index=14&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=yIcg0O2TnQw&t=0s&index=15&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=hbo1ro2LSIk&t=0s&index=16&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=-DWInAk4_f4&t=0s&index=17&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=gxg3GBgTulM&t=0s&index=18&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=ZDy9ySWPOZE&t=0s&index=19&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=oh6tYqsWumU&t=0s&index=20&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=rlTzT4yHyK8&t=0s&index=21&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=9DkuGh2zq-k&t=0s&index=22&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=fr-szBxntOY&t=0s&index=23&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=PL2ki8-VmLE&t=0s&index=24&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=88tS0Nw4Szc&t=0s&index=25&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=bFCWH6fpbuo&t=0s&index=26&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=kWnOlydgEnM&t=0s&index=27&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=TMJ76mUzXqk&t=0s&index=29&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=3P13Pv-zw5o&t=0s&index=30&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=EXe9j5mFz7c&t=0s&index=31&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=2XKmxGG8wyA&t=0s&index=32&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=7vcizSZwTtQ&t=0s&index=33&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=yrzOxgolUtM&t=0s&index=34&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=FquW9kMMXYU&t=0s&index=35&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ",
                    "https://www.youtube.com/watch?v=skM9ax65eSw&t=0s&index=36&list=PLhbs8A5De9zROh56gmXbYshcs_KPw4lJZ"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALDOKHAN))
            return new String[]{
                    "https://www.youtube.com/watch?v=UBCAP6aBOGM&t=0s&index=1&list=PL0C5466BEFBAB4D34",
                    "https://www.youtube.com/watch?v=pnQoRH3EyXk&t=0s&index=2&list=PL0C5466BEFBAB4D34",
                    "https://www.youtube.com/watch?v=0r5lr2Jnkfw&t=0s&index=3&list=PL0C5466BEFBAB4D34",
                    "https://www.youtube.com/watch?v=M4WuNBFtulc&t=0s&index=4&list=PL0C5466BEFBAB4D34",
                    "https://www.youtube.com/watch?v=oxsk_p0JT4U&t=0s&index=5&list=PL0C5466BEFBAB4D34"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALTAWBA))
            return new String[]{
                    "https://www.youtube.com/watch?v=rlYaC_udYQ0",
                    "https://www.youtube.com/watch?v=uBjik7MX25I",
                    "https://www.youtube.com/watch?v=4yiwA8U3QoQ",
                    "https://www.youtube.com/watch?v=gDyMhvmHph8",
                    "https://www.youtube.com/watch?v=4hjcEooGj2k",
                    "https://www.youtube.com/watch?v=WVjXaXtfx7U",
                    "https://www.youtube.com/watch?v=IOn0JdKFdxI",
                    "https://www.youtube.com/watch?v=JOvpE-P8QWA",
                    "https://www.youtube.com/watch?v=iboL-Pngv08",
                    "https://www.youtube.com/watch?v=QJNmj3WKh6w",
                    "https://www.youtube.com/watch?v=bm4yJM-t8DM",
                    "https://www.youtube.com/watch?v=RbyST3RfadA",
                    "https://www.youtube.com/watch?v=rA44OMi1Z9U",
                    "https://www.youtube.com/watch?v=Qh4aB7QwPAQ",
                    "https://www.youtube.com/watch?v=-O_9scZKZVA",
                    "https://www.youtube.com/watch?v=TWw432PdyHI",
                    "https://www.youtube.com/watch?v=AwUxEo_2Az4",
                    "https://www.youtube.com/watch?v=ukZ2efRnB0A",
                    "https://www.youtube.com/watch?v=7QLdc0QWkE4",
                    "https://www.youtube.com/watch?v=sW2z75ux8pU&t=0s&index=3&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=90SybTX0Haw&t=0s&index=4&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=e1lq0KNfKAc&t=1s&index=5&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=xRnTrQK3blc",
                    "https://www.youtube.com/watch?v=-GXqFdwUy7w&t=0s&index=6&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=y2itpIvUIoM&t=0s&index=7&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=oYeHtDyrM5g&t=0s&index=8&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=HUnvROKeWbU&t=0s&index=9&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=2XfnhdXhtAg&t=0s&index=10&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=gmT6K1_hPPE&t=0s&index=11&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=VujNpxdG12o&t=0s&index=12&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=kxbF49Nm8YQ&t=0s&index=13&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=Qo3mFb9DMNI&t=0s&index=14&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=dCApTrsopvs&t=0s&index=15&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=cmmVGxO53DA&t=0s&index=16&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=SPHsRk84OVU&t=0s&index=17&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=sC32B-8EW7s&t=0s&index=18&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=XXArpqU29h8&t=0s&index=19&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=U5f-ZsKihZ4&t=0s&index=20&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=D-6ytst4Q-4&t=0s&index=21&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=_OChbo6oZzQ&t=0s&index=22&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=7t2tr2kTCOM&t=0s&index=23&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=mcDaz6qrnhw&t=0s&index=24&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=dhmA62-95U0&t=0s&index=25&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=THMHQCnmhmc&t=0s&index=26&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=c2ricGzoaqM&t=0s&index=27&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=h26H4kvHrJU&t=0s&index=28&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=uApPLx9bxVI&t=0s&index=29&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=VgRv87fXw7U&t=0s&index=30&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=wLwoxPHOZks&t=0s&index=31&list=PL5C4A6B974CF326A6",
                    "https://www.youtube.com/watch?v=dD8FPGLoGYM&t=0s&index=32&list=PL5C4A6B974CF326A6"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_LIVE_THE_MOMENT))
            return new String[]{
                    "https://www.youtube.com/watch?v=rlmpn4cE9qA",
                    "https://www.youtube.com/watch?v=ao85Bv_MaWM",
                    "https://www.youtube.com/watch?v=43xyAQi4jck",
                    "https://www.youtube.com/watch?v=FajY97t5IWI",
                    "https://www.youtube.com/watch?v=5C14tGht6pE",
                    "https://www.youtube.com/watch?v=-Q5FSDPWirY",
                    "https://www.youtube.com/watch?v=qDQ3vqGtgpU",
                    "https://www.youtube.com/watch?v=G8Tozyg-U9k",
                    "https://www.youtube.com/watch?v=csK4r0aOnO8",
                    "https://www.youtube.com/watch?v=dMdzhD_Zdmo",
                    "https://www.youtube.com/watch?v=BnZ-KWIDyOU",
                    "https://www.youtube.com/watch?v=BLicLhd4HA0",
                    "https://www.youtube.com/watch?v=kqJQEuMUZlQ",
                    "https://www.youtube.com/watch?v=TRcQJlnwB68",
                    "https://www.youtube.com/watch?v=AzltCljfp28",
                    "https://www.youtube.com/watch?v=9CSF0yLqQxc",
                    "https://www.youtube.com/watch?v=2gki5jbD4tg",
                    "https://www.youtube.com/watch?v=_eI4wh1v7J0",
                    "https://www.youtube.com/watch?v=2f81OOIAcy4",
                    "https://www.youtube.com/watch?v=fZEDC8cjQfo",
                    "https://www.youtube.com/watch?v=PcrBAaYKIMs",
                    "https://www.youtube.com/watch?v=nKMMHTAIwvA",
                    "https://www.youtube.com/watch?v=RCnVylGCt5w",
                    "https://www.youtube.com/watch?v=4wBGpwo4abU",
                    "https://www.youtube.com/watch?v=LR2Ir_51YZQ",
                    "https://www.youtube.com/watch?v=jQutLuU-QNA",
                    "https://www.youtube.com/watch?v=kKi4YfE1p_E",
                    "https://www.youtube.com/watch?v=nCArSDD8nPQ",
                    "https://www.youtube.com/watch?v=69eItcPpCaM"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_NEW_PERSON))
            return new String[]{
                    "https://www.youtube.com/watch?v=b6M319uoUTo&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=1",
                    "https://www.youtube.com/watch?v=1SUUivywwUA&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=2",
                    "https://www.youtube.com/watch?v=URJf9jX8anM&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=3",
                    "https://www.youtube.com/watch?v=HCtJNapxYq8&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=4",
                    "https://www.youtube.com/watch?v=sjNWRGBO4jI&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=5",
                    "https://www.youtube.com/watch?v=5ka82lQizd8&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=6",
                    "https://www.youtube.com/watch?v=0jsRYxtI5BQ&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=7",
                    "https://www.youtube.com/watch?v=_SDVlNMwcDY&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=8",
                    "https://www.youtube.com/watch?v=RB7XqUHyrCk&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=9",
                    "https://www.youtube.com/watch?v=LPWX64qdAvc&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=10",
                    "https://www.youtube.com/watch?v=D2a1V9XcTIA&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=11",
                    "https://www.youtube.com/watch?v=6LUUayymyPo&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=12",
                    "https://www.youtube.com/watch?v=zCOAynQFzFw&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=13",
                    "https://www.youtube.com/watch?v=Ht6EQf_4-WA&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=14",
                    "https://www.youtube.com/watch?v=jPKpSFKMvgs&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=15",
                    "https://www.youtube.com/watch?v=3G14a8KSy20&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=16",
                    "https://www.youtube.com/watch?v=EvJQlm5G9AQ&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=17",
                    "https://www.youtube.com/watch?v=9o9LzpK-sUk&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=18",
                    "https://www.youtube.com/watch?v=UQ-ImWBPQrQ&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=19",
                    "https://www.youtube.com/watch?v=CKm7MFdG5EU&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=20",
                    "https://www.youtube.com/watch?v=zUn3XIbN78k&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=21",
                    "https://www.youtube.com/watch?v=dRkjxdgWn2w&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=22",
                    "https://www.youtube.com/watch?v=gK-U-sVVWrI&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=23",
                    "https://www.youtube.com/watch?v=Ggxa8Adm1fY&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=24",
                    "https://www.youtube.com/watch?v=SM_AW7cqG_8&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=25",
                    "https://www.youtube.com/watch?v=5pgiibbV-uI&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=26",
                    "https://www.youtube.com/watch?v=f2wX0PWvRq8&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=27",
                    "https://www.youtube.com/watch?v=x-NQpcwTE0k&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=28",
                    "https://www.youtube.com/watch?v=5yrEr5ZSs4A&list=PLiJggHtOlnN1qvHxHfIRhyL22rlj_Smce&index=29"
            };

        // episode 13 & 14 need family supervision so it's not available to watch on youtube based on
        // author desire the working links for these episodes ar
        // http://ar.assabile.com/ahmad-alshugairi-149/series/khawater-10-141/episode-13-1739.htm
        // http://ar.assabile.com/ahmad-alshugairi-149/series/khawater-10-141/episode-14-1740.htm
        if (arProgramName.equals(PROGRAM_NAME_AR_REFLECTIONS_10))
            return new String[]{
                    "https://www.youtube.com/watch?v=ek3rrcKhTtI&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=2",
                    "https://www.youtube.com/watch?v=vvnZ5-Hvo70&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=3",
                    "https://www.youtube.com/watch?v=TtemPgd92U0&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=4",
                    "https://www.youtube.com/watch?v=E8AJ-PTnD2E&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=5",
                    "https://www.youtube.com/watch?v=xDTERgf5gaw&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=6",
                    "https://www.youtube.com/watch?v=ad4G4vX_PSk&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=7",
                    "https://www.youtube.com/watch?v=LrwYbLCYXHA&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=8",
                    "https://www.youtube.com/watch?v=Hq10fO9kavk&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=9",
                    "https://www.youtube.com/watch?v=MGoSP4VNYQY&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=10",
                    "https://www.youtube.com/watch?v=T4s1j6H3rz8&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=11",
                    "https://www.youtube.com/watch?v=3EkLtzcCT50&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=12",
                    "https://www.youtube.com/watch?v=GqMZxxnNMA0&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE&index=13",
                    "https://www.youtube.com/watch?v=Ah47AdNZYeM&index=14&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=NaQnmiVpHH4&index=15&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=g5B5J_iDls8&index=16&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=zT0H5veUIpA&index=17&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=lfxJ1BUMojs&index=18&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=lVY6ufcOW48&index=19&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=WDiivfq_--Q&index=20&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=PANqsZYtrx0&index=21&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=2Rp5Uo8YoOE&index=22&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=hw-k_YC3vAw&index=23&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=VnWJnUgFhjw&index=24&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=UWDcoXtNCXg&index=25&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=s7rS6OJ6jS0&index=26&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=ajRQu_HvsCE&index=27&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=9DSdo1OxGoY&index=28&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=Js-PUDG6Nic&index=29&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=cRevDFCnXXw&index=30&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE",
                    "https://www.youtube.com/watch?v=p2GH6Vdwy5c&index=31&list=PLM7DHPAGxHOG-oW-M-rLEn_eXDGX9qLnE"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_REFLECTIONS_11))
            return new String[]{
                    "https://www.youtube.com/watch?v=_hU_6T-P58c&index=31&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=vT5yUgxPWdE&index=30&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=t1nJtgK4TiY&index=29&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=tVHWOurB6nc&index=28&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=7lXQDL-cyGk&index=27&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=Uju8-UhIoVI&index=26&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=956Ia5aZyw4&index=25&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=EbsPzQ-5Wyo&index=24&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=efcwBYOzzZU&index=23&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=28WqQeGb0lc&index=22&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=OnUwaBBZ-yo&index=21&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=DzpAw0NQCnk&index=20&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=fXOmY6oNpSs&index=19&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=zK0C1yxGDsw&index=18&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=XXB1KTabBrE&index=17&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=BrmRUStXIUM&index=16&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=Uos6wQmeZMc&index=15&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=2964FGslkr8&index=14&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=TNKaJFGbpoQ&index=12&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=klm75mKAA20&index=11&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=Nwp9NZN6Z_c&index=10&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=zCnXDNfBd7k&index=9&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=3NsF5Uptk2E&index=8&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=acVa2IPnShI&index=7&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=eJNr5UmHnZM&index=6&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=mVTPzifca1s&index=5&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=MwqNndoHygk&index=4&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=wJyuEnxqB2s&index=3&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=VBVnW2iiKw0&index=2&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=BARhiRbhR6Y&index=1&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z",
                    "https://www.youtube.com/watch?v=o4EoM4lwbYQ&index=13&list=PLM7DHPAGxHOGkKI9XI_w6a5-pI3DdiR8z"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_FAITH_AND_ERA))
            return new String[]{
                    "https://www.youtube.com/watch?v=jouzGhBWvdM&index=29&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=mgaZSJQ9CIs&index=28&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=inCvyOYMzqM&index=27&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=Hfx9lhumeVs&index=26&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=mhJrCc05ucE&index=25&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=gwhzlG3e94w&index=24&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=1y9kdbv8dro&index=23&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=T7Gsr7CaZuM&index=22&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=IF6upcUC_T4&index=21&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=yap0k_LN9do&index=20&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=Xp0Ip3bJ_w0&index=19&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=PV2caSxkTi8&index=18&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=vI-7_hMlVak&index=17&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=QSIB8jmCr7I&index=16&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=CMxTWEtKG1s&index=15&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=9DlxZlgERvU&index=14&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=23Z__Wv6qTw&index=13&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=GHlUmInDmqI&index=12&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=U3tHUOus5WM&index=11&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=htJEb-x7K_4&index=10&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=AMIAY_6sVhc&index=9&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=oeD4510i_Fk&index=8&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=-UVxCC9tfuY&index=7&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=lNfz57zO1fM&index=6&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=yQ8lqIlr0xM&index=5&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=g-TR5JrbchA&index=4&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=TJoWlSbkvh0&index=3&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=dQhNRYCo5WM&index=2&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz",
                    "https://www.youtube.com/watch?v=2I0hDIsZFTY&index=1&list=PLhbs8A5De9zRH3A1NjP9u6lwjvMQdcluz"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_OMAR_SERIES))
            return new String[]{
                    "https://www.youtube.com/watch?v=GbTTcsvFUy8&index=32&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=ELbEFTkqpCU&index=31&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=nC01L4iT8uQ&index=30&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=o6qNGUAciB4&index=29&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=xDBf4cEHbdY&index=28&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=RndSSy9KtHY&index=27&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=9hW53VMGqM8&index=26&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=fz1ddqRYlhk&index=25&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=0MSQFQAUoY8&index=24&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=ta_-JYV3JbE&index=23&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=Z49Q_frIkyU&index=22&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=KuwiKTlwn_I&index=21&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=k1yGdsxuKZU&index=20&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=U_35SepvDjc&index=19&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=u-LM0VvtW78&index=18&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=ThXZ1fWTyFQ&index=17&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=zE_PbIWYbq8&index=16&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=B9ti1xiuZkY&index=15&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=WdZFw7yLeK8&index=14&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=mCtTkqHEIPo&index=13&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=mg_qkUKFbK4&index=12&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=gxZPzzwU0W8&index=11&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=suOQO9RfWtw&index=10&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=L5ZkLCmk6-I&index=9&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=MvXyEi1rOUw&index=8&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=6PrKfU4iYHo&index=7&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=GdRIniYxeas&index=6&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=6i7zSwlmo0g&index=5&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=QY51-ylHZKM&index=4&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=XXXVJQeY_fI&index=3&list=PL8283D4819DF00DAC",
                    "https://www.youtube.com/watch?v=IrJDAymV9Eg&list=PL8283D4819DF00DAC&index=2"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_THINK))
            return new String[]{
                    "https://www.youtube.com/watch?v=JptjGh_2B5w&index=93&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=JpH3zIC267U&index=92&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=VL4Q7mmDJnc&index=91&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=CGyolp4MW38&index=90&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=O-_zA9AlGWQ&index=89&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=edrTcehhzjs&index=88&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=vMiLsho9X6g&index=87&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=pfpdrSTutSY&index=86&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=X2N9mWCh_T0&index=85&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=IVT1bjpE-AM&index=84&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=gHvkd2XHqec&index=83&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=neHmPHSZv-0&index=82&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=vCCxsTLIqVY&index=81&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=zRvbuYSXx3s&index=80&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=GCNtBp97bF4&index=79&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=-csk5V1dZFc&index=78&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=w7QH_gXk5hM&index=77&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=2YD4Gi5DrlI&index=76&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=oPaWjBJcfco&index=75&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=7_VC13oA1-8&index=74&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=KsfnPBYfxmQ&index=73&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=DNK4PnblL54&index=72&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=ow3Npnp3BW8&index=71&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=opBLIRPBCm0&index=70&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=WnbxQ86roVs&index=69&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=5jXJTdJwOPQ&index=68&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=7WuldbdG_-c&index=67&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=WMEIEmDDM-E&index=66&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=qqUfZBt1zy0&index=65&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=ulrXPl7KFgs&index=64&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=t7MTooZlfSM&index=63&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=VflDW0emRSs&index=62&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=kafOKwuwwTc&index=61&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=3bvUIH7chzU&index=60&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=Asf6fg3cq9c&index=59&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=DSrJ4tK85I4&index=58&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=tf_fNcP7S5s&index=57&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=-yov0KWAl9c&index=56&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=dObWanCHxXQ&index=55&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=zNNBnI7aj8g&index=54&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=LIcbZ2esHOE&index=53&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=ebifwLG41iY&index=52&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=okYf6YIVgJg&index=51&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=OQhrpVTgtIY&index=50&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=mKStxPO6vk4&index=49&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=vcc0EldAF1M&index=48&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=ZLQRXQ_SePc&index=47&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=PNsxN_uxo_Q&index=46&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=-EiYf9D4kBo&index=45&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=8xfHnlzm6RU&index=44&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=pImWcUXUalg&index=43&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=hQGCWcEvawU&index=42&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=maLujp9txww&index=41&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=DLv_Q-XnD6g&index=40&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=tjtnpECNKmU&index=39&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=DX0SDm79uGM&index=38&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=UZ3PyWh-xJ4&index=37&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=uCigIAaTD0s&index=36&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=EnKnzJ3msqM&index=35&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=L_jCoVJ7nlI&index=34&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=l9XyM3Sb7VQ&index=33&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=cqmamX03C_8&index=32&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=MaINKQPBD3s&index=31&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=COxrDc3Axlo&index=30&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=NILgoR946sY&index=29&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=12gU0FJSo4Y&index=28&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=aU-n-AHS-gw&index=27&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=91dcNdxrN3w&index=26&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=qVDqMQ6w6nI&index=25&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=mEi7DoqwDdE&index=24&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=T9Z0u4U8D_4&index=23&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=PucTnnThyAU&index=22&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=PKvVU7hMYas&index=21&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=xqb4avsCels&index=20&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=nUZD-SNovRM&index=19&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=qqf13wBqbKc&index=18&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=rnsuoAAMZdE&index=17&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=a9R5MyQolBk&index=16&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=5AkzqAPVQ1Y&index=15&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=8tfJH5QHjLQ&index=14&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=fSYTccWEDwk&index=13&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=oW1GfEVUoKc&index=12&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=tL6xUAdB7gM&index=11&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=1Ff_Iat3VfY&index=10&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=XL6-iBWhSYI&index=9&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=YWxogJt4gqY&index=8&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=LceeQXJZcOE&index=7&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=T8jlPR3KPB0&index=6&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=9-LjytOi8Xk&index=5&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=95wqhkfYdQY&index=4&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=vFw3nxpMVvY&index=3&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=Yc9Ni0FTeYA&index=2&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",
                    "https://www.youtube.com/watch?v=tAPALaGQd0M",
                    "https://www.youtube.com/watch?v=Hxd-3tZAbjU&index=1&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_",

                    "https://www.youtube.com/watch?v=SZ-1YQgeyvo&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=86",
                    "https://www.youtube.com/watch?v=EpkPlMZfItw&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=85",
                    "https://www.youtube.com/watch?v=EpGnXxXzwBM&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=84",
                    "https://www.youtube.com/watch?v=bf2neShpHCI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=83",
                    "https://www.youtube.com/watch?v=JON6o5ZmgGw&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=82",
                    "https://www.youtube.com/watch?v=sCy6BcbtdPo&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=81",
                    "https://www.youtube.com/watch?v=LsDQ4xyqA7A&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=80",
                    "https://www.youtube.com/watch?v=ZSV1w1pDJi0&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=79",
                    "https://www.youtube.com/watch?v=xzY1h6YtTg4&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=78",
                    "https://www.youtube.com/watch?v=M2xg0e9xmBk&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=77",
                    "https://www.youtube.com/watch?v=J2HIe5zWEFQ&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=76",
                    "https://www.youtube.com/watch?v=L0d0IEYVlRM&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=75",
                    "https://www.youtube.com/watch?v=EwTRMY6d15Y&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=74",
                    "https://www.youtube.com/watch?v=O6nrA9lckAs&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=73",
                    "https://www.youtube.com/watch?v=5pjAUfEDsz4&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=72",
                    "https://www.youtube.com/watch?v=UL2UjuiUpUo&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=71",
                    "https://www.youtube.com/watch?v=bwBgrRH4Mkc&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=70",
                    "https://www.youtube.com/watch?v=35hsUHT_7zk&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=69",
                    "https://www.youtube.com/watch?v=bN9Vd6Gs-4A&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=68",
                    "https://www.youtube.com/watch?v=a-l6MBO4JKY&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=67",
                    "https://www.youtube.com/watch?v=btw9_9i8rZc&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=66",
                    "https://www.youtube.com/watch?v=qWIGy2oMKtY&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=65",
                    "https://www.youtube.com/watch?v=-jnTwyyh8XQ&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=64",
                    "https://www.youtube.com/watch?v=mMnu0z8IzVQ&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=63",
                    "https://www.youtube.com/watch?v=TJgYOj_rngU&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=62",
                    "https://www.youtube.com/watch?v=Br5eR872Nyc&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=61",
                    "https://www.youtube.com/watch?v=kDviAJq4ZX0&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=60",
                    "https://www.youtube.com/watch?v=tDC7dWkxLaA&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=59",
                    "https://www.youtube.com/watch?v=Fk-yJj6f35w&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=58",
                    "https://www.youtube.com/watch?v=5wOZmWvImRk&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=57",
                    "https://www.youtube.com/watch?v=c67S6-FKUBY&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=56",
                    "https://www.youtube.com/watch?v=xxYn8PJdE1U&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=55",
                    "https://www.youtube.com/watch?v=vvkTOytSjto&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=54",
                    "https://www.youtube.com/watch?v=46q46Qwr2lE&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=53",
                    "https://www.youtube.com/watch?v=bIDW8PGC9ow&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=52",
                    "https://www.youtube.com/watch?v=sVPlV__rPcI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=51",
                    "https://www.youtube.com/watch?v=ImiCKgF4L1Q&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=50",
                    "https://www.youtube.com/watch?v=KcPbfmqxznA&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=49",
                    "https://www.youtube.com/watch?v=BihK35nbVWw&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=48",
                    "https://www.youtube.com/watch?v=MXKfpymbZdI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=47",
                    "https://www.youtube.com/watch?v=DFelhtRANvM&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=46",
                    "https://www.youtube.com/watch?v=Kh-xLu3FofU&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=45",
                    "https://www.youtube.com/watch?v=hT7DaKjOM68&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=44",
                    "https://www.youtube.com/watch?v=J3rjjpYfMKI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=43",
                    "https://www.youtube.com/watch?v=9vcConAW2BE&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=42",
                    "https://www.youtube.com/watch?v=Lgn8DQsvgUA&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=41",
                    "https://www.youtube.com/watch?v=XwsDVdGOn14&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=40",
                    "https://www.youtube.com/watch?v=72b2nffTyiI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=39",
                    "https://www.youtube.com/watch?v=l7icWaK_ch8&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=38",
                    "https://www.youtube.com/watch?v=bw45AR-lLEs&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=37",
                    "https://www.youtube.com/watch?v=FDZBuaFj8pI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=36",
                    "https://www.youtube.com/watch?v=40l_oxH3vyE&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=35",
                    "https://www.youtube.com/watch?v=hKN9GzUnRUs&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=34",
                    "https://www.youtube.com/watch?v=qQvhr60PSak&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=33",
                    "https://www.youtube.com/watch?v=0HSHT8JwZro&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=32",
                    "https://www.youtube.com/watch?v=paNHEMYTiKM&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=31",
                    "https://www.youtube.com/watch?v=sWUSAaHG4G0&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=30",
                    "https://www.youtube.com/watch?v=lrpj3dtMeto&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=29",
                    "https://www.youtube.com/watch?v=vxD7VMODx9w&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=28",
                    "https://www.youtube.com/watch?v=LPxHSSSQ8KQ&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=27",
                    "https://www.youtube.com/watch?v=4aXKNNlhNO4&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=26",
                    "https://www.youtube.com/watch?v=nE4IgMiZshg&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=25",
                    "https://www.youtube.com/watch?v=PS-o4a-c9NA&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=24",
                    "https://www.youtube.com/watch?v=Xtv63s61yvI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=23",
                    "https://www.youtube.com/watch?v=ERMySmjo1pc&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=22",
                    "https://www.youtube.com/watch?v=G8ydZ_SKQh0&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=21",
                    "https://www.youtube.com/watch?v=uiyHbut_xOY&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=20",
                    "https://www.youtube.com/watch?v=dYJwkhQb_VU&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=19",
                    "https://www.youtube.com/watch?v=M5rbE-4u_-w&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=18",
                    "https://www.youtube.com/watch?v=sEH0EGskPmk&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=17",
                    "https://www.youtube.com/watch?v=1otefpW0nh4&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=16",
                    "https://www.youtube.com/watch?v=3uNEHXhPHLQ&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=15",
                    "https://www.youtube.com/watch?v=KkxRYB5nInc&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=14",
                    "https://www.youtube.com/watch?v=rMCDQsgdjc0&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=13",
                    "https://www.youtube.com/watch?v=ynADpwjCDtw&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=12",
                    "https://www.youtube.com/watch?v=851l6oNHx44&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=11",
                    "https://www.youtube.com/watch?v=q6ocCzlSFBI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=10",
                    "https://www.youtube.com/watch?v=NZMQAwKG7ck&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=9",
                    "https://www.youtube.com/watch?v=Lq67iyaqb2s&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=8",
                    "https://www.youtube.com/watch?v=aSYcuXH4GXQ&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=7",
                    "https://www.youtube.com/watch?v=jK54rBDePsA&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=6",
                    "https://www.youtube.com/watch?v=3kOdQMoA9JI&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=5",
                    "https://www.youtube.com/watch?v=iqTqncN4KDM&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=4",
                    "https://www.youtube.com/watch?v=PLpIip1AdRo&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=3",
                    "https://www.youtube.com/watch?v=KkSghKAahxg&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=2",
                    "https://www.youtube.com/watch?v=fzFjwiVGXVg&list=PLiJggHtOlnN3LdOTtPfHB7xp6KveCXkR_&index=1"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_THINK_2))
            return new String[]{
                    "https://www.youtube.com/watch?v=Q0vTpHFr7-0&index=1&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=usRxEjWJ39A&index=2&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=SehpsT9ogNc&index=3&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=IUF7381iNO8&index=4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=m4tvHzKdLQ4&index=5&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=kWQyVu7KmoU&index=6&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=-TgcCXTeiEM&index=7&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=OWkeGK6Tkis&index=8&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=cDLDj14LGJY&index=9&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=OwHaYAMHE9w&index=10&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=U4h_aGeJRAM&index=11&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=NzzLL0FOlp0&index=12&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=7X3yQStxu60&index=13&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=b56yreR54iE&index=14&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=1Kud6PBQoyU&index=15&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=kg6Fl4G9L8Y&index=16&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=4ioCE_a0z2Y&index=17&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=qm4nzOfNcZU&index=18&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=AM4W6OVqyYI&index=19&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=jhxQnLYskq4&index=20&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=wT8BuyZxiNo&index=21&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=dL8efL9rFyc&index=22&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=9OMogQf3Gg4&index=23&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=0yQLVGymPdQ&index=24&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=rTikKQjUSbQ&index=25&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=wDW-bNhjAR8&index=26&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=ETAaNZSQ14U&index=27&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=1ZZdwklzYNw&index=28&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=ikTVkAFDtq4&index=29&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=VmJYxIIhmYE&index=30&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=btlMup6tHyM&index=31&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=ApOHiEaIiRU&index=32&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=vRGDRZGis1k&index=33&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=0ExbO__zaoM&index=34&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=5BT0s6ulvzk&index=35&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=QlLSx14Vv2Q&index=36&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=FTvKcrVCygs&index=37&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=rZ7gaBS_Ziw&index=38&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=Pr45Z-BmuNk&index=39&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=VLT0QSqNkHE&index=40&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=CKaUY-AAjbE&index=41&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=0nf-bbUeWrU&index=42&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=LwWZ-S2Hy-o&index=43&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=-wEwgg5fucU&index=44&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=JpnaCpEvEZM&index=45&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=xk5R1B3Up68&index=46&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=VERGBFHH0yo&index=47&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=BuhpSNRL_jI&index=48&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=3zWRSUPoXGU&index=49&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=tq84M3P41Ok&index=50&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=eA9B5OT5oM4&index=51&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=cJ50m-33JRY&index=52&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=0fyRMAxFTfA&index=53&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=SWnLmvDGfhw&index=54&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=dV5DT1KJm6I&index=55&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=MeKDEAtKQUI&index=56&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=PEppluw_MMA&index=57&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=v3e7oUt_HjQ&index=58&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=4f4qOo0iELc&index=59&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=Na1ku-K6vgM&index=60&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=6M6dqYN6lBA&index=61&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=4Rs38BjRLuU&index=62&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=PQyw5ef8T7s&index=63&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=Qj4kknkIT_A&index=64&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=CSubri5sCAg&index=65&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=1oTxjNS3EH8&index=66&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=PrzTvQMx6_4&index=67&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=C3oyqf1xmVM&index=68&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=2b8jwZF42Bs&index=69&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=ZyFiTGu8Iug&index=70&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=x9pju4ZYypA&index=71&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=JXXo3WReU64&index=72&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=Hza9HNoxkUU&index=73&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=jOGJhuJUrk0&index=74&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=-DHPUIg3wgE&index=75&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=JGWM7HQCx1E&index=76&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=q364YynijMw&index=77&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=70IsKcPHfEE&index=78&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",
                    "https://www.youtube.com/watch?v=PSe8__zI2Uw&index=79&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey",

                    "https://www.youtube.com/watch?v=zuIzX0_vlC0&index=80&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=1qTpdy5ztUI&index=81&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=AsczzSdXYD8&index=82&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=Tq2f-QsXfQE&index=83&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=JN_zXxSj0JI&index=84&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=1eJKb67vWlQ&index=85&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=-k9F694bXr0&index=86&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=ZTW__C_tl0g&index=87&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=brK1smT23sQ&index=88&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=jEjqRDvv2H0&index=89&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=vQWo6DykdUk&index=90&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=-gk4YH1rRRI&index=91&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=_4qVcCqUtTM&index=92&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=VRQUGBSzElk&index=93&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=iRuN1maGlLk&index=94&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=obOOvZVMjyc&index=95&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=4ie4C5lkjOo&index=96&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=mf0Ft3wsEXw&index=97&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=fhjbGTLiK8c&index=98&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=RpRo1ATlRMM&index=99&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=nyT-vOf75Ww&index=100&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&t=0s",
                    "https://www.youtube.com/watch?v=3rwl-AcrFxY&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=101&t=0s",
                    "https://www.youtube.com/watch?v=GFP_eLl4OCo&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=102&t=0s",
                    "https://www.youtube.com/watch?v=hJIz0vCt0F4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=103&t=0s",
                    "https://www.youtube.com/watch?v=RvEYUHBFHr8&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=104&t=0s",
                    "https://www.youtube.com/watch?v=5CBGcHzmuRI&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=105&t=0s",
                    "https://www.youtube.com/watch?v=IhBHJOFgUl8&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=106&t=0s",
                    "https://www.youtube.com/watch?v=kE7ML6UXe3Y&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=107&t=0s",
                    "https://www.youtube.com/watch?v=DywAPZHuzjg&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=108&t=0s",
                    "https://www.youtube.com/watch?v=05aQ9C7Pzb0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=109&t=0s",
                    "https://www.youtube.com/watch?v=qOtC_6QKl70&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=110&t=0s",
                    "https://www.youtube.com/watch?v=YmGTX1hqblI&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=111&t=0s",
                    "https://www.youtube.com/watch?v=KqYhdVVS9JM&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=112&t=0s",
                    "https://www.youtube.com/watch?v=1KPCzQZqsnQ&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=113&t=0s",
                    "https://www.youtube.com/watch?v=dFaHyvWUIo0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=114&t=0s",
                    "https://www.youtube.com/watch?v=EwOdsANLQq4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=115&t=0s",
                    "https://www.youtube.com/watch?v=AWuBz2VA0l0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=116&t=0s",
                    "https://www.youtube.com/watch?v=JFEvoplNY28&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=117&t=0s",
                    "https://www.youtube.com/watch?v=WQWBfK_KUC0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=118&t=0s",
                    "https://www.youtube.com/watch?v=GHneYLg8gXc&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=119&t=0s",
                    "https://www.youtube.com/watch?v=68k25CIe0Ws&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=120&t=0s",
                    "https://www.youtube.com/watch?v=SvvYtLVQ0TY&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=121&t=0s",
                    "https://www.youtube.com/watch?v=yrKP9_wuc38&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=122&t=0s",
                    "https://www.youtube.com/watch?v=t0vvBGFqrjE&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=123&t=0s",
                    "https://www.youtube.com/watch?v=FlUy48HTbzA&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=124&t=0s",
                    "https://www.youtube.com/watch?v=JuumPcMsbsU&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=125&t=0s",
                    "https://www.youtube.com/watch?v=MbxZG9X1EpQ&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=126&t=0s",
                    "https://www.youtube.com/watch?v=9e8ZnA10VRo&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=127&t=0s",
                    "https://www.youtube.com/watch?v=ENeAGrTW1II&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=128&t=0s",
                    "https://www.youtube.com/watch?v=tt88JtUbwbA&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=129&t=0s",
                    "https://www.youtube.com/watch?v=Gr3zXRm7PC4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=130&t=0s",
                    "https://www.youtube.com/watch?v=fbAKCxPH6F4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=131&t=0s",
                    "https://www.youtube.com/watch?v=zSp2HVdVunM&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=132&t=0s",
                    "https://www.youtube.com/watch?v=2WQULtQFaNg&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=133&t=0s",
                    "https://www.youtube.com/watch?v=kskqzjSlXQI&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=134&t=0s",
                    "https://www.youtube.com/watch?v=8dkccR2bjI4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=135&t=0s",
                    "https://www.youtube.com/watch?v=LlLci7DTlPU&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=136&t=0s",
                    "https://www.youtube.com/watch?v=swMmmVPtDa0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=137&t=6s",
                    "https://www.youtube.com/watch?v=KZnysqug5vs&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=138&t=0s",
                    "https://www.youtube.com/watch?v=BQCq4cjFCh8&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=139&t=0s",
                    "https://www.youtube.com/watch?v=-M0d9pEE3m0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=140&t=0s",
                    "https://www.youtube.com/watch?v=PlborJ4jpSg&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=141&t=0s",
                    "https://www.youtube.com/watch?v=BN9-3X3oiiA&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=142&t=0s",
                    "https://www.youtube.com/watch?v=ezD5EhrDfe4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=143&t=0s",
                    "https://www.youtube.com/watch?v=KDerlm2d3y0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=144&t=0s",
                    "https://www.youtube.com/watch?v=_pxaWl-yjxE&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=145&t=0s",
                    "https://www.youtube.com/watch?v=bv-4WXExjzY&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=146&t=0s",
                    "https://www.youtube.com/watch?v=EC9Ra41l0TE&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=147&t=0s",
                    "https://www.youtube.com/watch?v=5WEj4VfkQ5A&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=148&t=0s",
                    "https://www.youtube.com/watch?v=AvCpyO7cYns&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=149&t=0s",
                    "https://www.youtube.com/watch?v=RXJOq1Vdo8A&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=150&t=0s",
                    "https://www.youtube.com/watch?v=CP6eMyqZXgc&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=151&t=0s",
                    "https://www.youtube.com/watch?v=Z8-YGkG1AT0&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=152&t=0s",
                    "https://www.youtube.com/watch?v=u8x-M_8BFVs&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=153&t=0s",
                    "https://www.youtube.com/watch?v=jLWK-UcpDo4&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=154&t=0s",
                    "https://www.youtube.com/watch?v=10t8Om0v0sk&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=155&t=0s",
                    "https://www.youtube.com/watch?v=ebSsGIHcjTU&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=156&t=0s",
                    "https://www.youtube.com/watch?v=cQ3SdrVMcEo&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=157&t=0s",
                    "https://www.youtube.com/watch?v=OGhq6CqmueA&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=158&t=0s",
                    "https://www.youtube.com/watch?v=c5dYXhzXLLU&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=159&t=0s",
                    "https://www.youtube.com/watch?v=xf-mlPVKbJM&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=160&t=0s",
                    "https://www.youtube.com/watch?v=UtG7zPZHm74&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=161&t=0s",
                    "https://www.youtube.com/watch?v=fbiE6yWinBc&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=162&t=0s",
                    "https://www.youtube.com/watch?v=D8HvqJxogQc&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=163&t=0s",
                    "https://www.youtube.com/watch?v=W-HxE69rnFI&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=164&t=0s",
                    "https://www.youtube.com/watch?v=3Szn7BRM5_8&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=165&t=0s",
                    "https://www.youtube.com/watch?v=MeTXRPqrx_I&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=166&t=0s",
                    "https://www.youtube.com/watch?v=ksKtrHiYeTw&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=167&t=0s",
                    "https://www.youtube.com/watch?v=EMJW1EwUu2o&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=168&t=0s",
                    "https://www.youtube.com/watch?v=6ddhq1XFP1Q&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=169&t=0s",
                    "https://www.youtube.com/watch?v=RPp5d89JgYg&list=PLLWLrSyl8h1aW2DYKVugEjS4nIUrfQJey&index=170&t=7s"

            };

        if (arProgramName.equals(PROGRAM_NAME_AR_MESSAGE_FROM_GOD))
            return new String[]{
                    "https://www.youtube.com/watch?v=E1K1mXeVQbE&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=29",
                    "https://www.youtube.com/watch?v=V_PxpqwapME&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=28",
                    "https://www.youtube.com/watch?v=IAqm1lQJ3Iw&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=27",
                    "https://www.youtube.com/watch?v=DTyavtRx5K0&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=26",
                    "https://www.youtube.com/watch?v=sxVmlCRtJYo&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=25",
                    "https://www.youtube.com/watch?v=gpJXyyTqL7Y&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=24",
                    "https://www.youtube.com/watch?v=ua65r6eVLbI&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=23",
                    "https://www.youtube.com/watch?v=ZSaglHizPKU&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=22",
                    "https://www.youtube.com/watch?v=XOmP7MjvSYM&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=21",
                    "https://www.youtube.com/watch?v=Iy1lOtv8MpY&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=20",
                    "https://www.youtube.com/watch?v=_YKtYAsBBx8&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=19",
                    "https://www.youtube.com/watch?v=5kGvcrjJWf8&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=18",
                    "https://www.youtube.com/watch?v=bIVpBMB8tsk&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=17",
                    "https://www.youtube.com/watch?v=IhWtAI7uRC0&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=16",
                    "https://www.youtube.com/watch?v=rWPjnvlYUUs&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=15",
                    "https://www.youtube.com/watch?v=jeNAVa57_ME&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=14",
                    "https://www.youtube.com/watch?v=dGSYdmXJ6Ts&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=13",
                    "https://www.youtube.com/watch?v=dYQQBuA4HbY&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=12",
                    "https://www.youtube.com/watch?v=tYEoHydMVAU&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=11",
                    "https://www.youtube.com/watch?v=8wRPyXdvJTQ&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=10",
                    "https://www.youtube.com/watch?v=zY9jF4ccEyY&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=9",
                    "https://www.youtube.com/watch?v=1tvlvuhIE1s&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=8",
                    "https://www.youtube.com/watch?v=_Zl19L1sgoc&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=7",
                    "https://www.youtube.com/watch?v=InyaP5hQxrY&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=6",
                    "https://www.youtube.com/watch?v=BjQbpGeezhw&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=5",
                    "https://www.youtube.com/watch?v=cXTv6I8JTFM&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=4",
                    "https://www.youtube.com/watch?v=5_URzJV0NTc&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=3",
                    "https://www.youtube.com/watch?v=by_jq0EScGM&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=2",
                    "https://www.youtube.com/watch?v=mcEsQd1dOPQ&list=PLiJggHtOlnN1bKED5w--puJsyB-9RJgxL&index=1"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_PROPHET_OF_MERCY))
            return new String[]{
                    "https://www.youtube.com/watch?v=tn3bGRmFLNI&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=29",
                    "https://www.youtube.com/watch?v=FWdcU3mMYno&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=28",
                    "https://www.youtube.com/watch?v=GImys95k1gc&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=27",
                    "https://www.youtube.com/watch?v=gPUmLkzJCp4&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=26",
                    "https://www.youtube.com/watch?v=dnNLmY1c3Bw&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=25",
                    "https://www.youtube.com/watch?v=0uXZsYt8h5k&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=24",
                    "https://www.youtube.com/watch?v=ynXDVYuSLtc&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=23",
                    "https://www.youtube.com/watch?v=LPLriV6RG-8&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=22",
                    "https://www.youtube.com/watch?v=zVIjSbilDKM&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=21",
                    "https://www.youtube.com/watch?v=CVliOikZKR0&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=20",
                    "https://www.youtube.com/watch?v=ZTdtlRnyN5A&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=19",
                    "https://www.youtube.com/watch?v=RGKnVp5F0SI&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=18",
                    "https://www.youtube.com/watch?v=MwbnnJL-VJg&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=17",
                    "https://www.youtube.com/watch?v=9o3JgyWgrGc&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=16",
                    "https://www.youtube.com/watch?v=kXzwMawuaoc&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=15",
                    "https://www.youtube.com/watch?v=JpuRjdBbz_g&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=14",
                    "https://www.youtube.com/watch?v=1QnLWdU6x-g&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=13",
                    "https://www.youtube.com/watch?v=MSpBFLP8GS8&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=12",
                    "https://www.youtube.com/watch?v=CGQN0wN12Bs&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=11",
                    "https://www.youtube.com/watch?v=NUl7mHhRLWg&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=10",
                    "https://www.youtube.com/watch?v=xyKN_VnVY3k&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=9",
                    "https://www.youtube.com/watch?v=_f0e1n8WWxI&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=8",
                    "https://www.youtube.com/watch?v=DOYeUfkTgZY&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=7",
                    "https://www.youtube.com/watch?v=pM73KW5TwAE&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=6",
                    "https://www.youtube.com/watch?v=kxovvT5gEgw&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=5",
                    "https://www.youtube.com/watch?v=hOn5GZk9tGw&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=4",
                    "https://www.youtube.com/watch?v=WVvm4MFFZ3Q&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=3",
                    "https://www.youtube.com/watch?v=RgsbWOO7gHw&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=2",
                    "https://www.youtube.com/watch?v=wqz6nwWwvEc&list=PLhbs8A5De9zTtOmQUAMWrh3_YcZVaey4S&index=1"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_LIFE_ROAD))
            return new String[]{
                    "https://www.youtube.com/watch?v=RbSApM8-FnA&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=30",
                    "https://www.youtube.com/watch?v=SW5fsdEVwhk&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=29",
                    "https://www.youtube.com/watch?v=UKMLnwc7ra4&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=28",
                    "https://www.youtube.com/watch?v=1i7IfHl-YNU&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=27",
                    "https://www.youtube.com/watch?v=WqjUbo3at6w&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=26",
                    "https://www.youtube.com/watch?v=cFa-5uoPfIA&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=25",
                    "https://www.youtube.com/watch?v=pH8k1EQje8A&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=24",
                    "https://www.youtube.com/watch?v=4qySdL52T_E&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=23",
                    "https://www.youtube.com/watch?v=2VqcVZWlFgQ&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=22",
                    "https://www.youtube.com/watch?v=unJjSFSkoNg&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=21",
                    "https://www.youtube.com/watch?v=uFobBv9JYi0&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=20",
                    "https://www.youtube.com/watch?v=eqGHATGXtqs&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=19",
                    "https://www.youtube.com/watch?v=7cmC8go8k8g&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=18",
                    "https://www.youtube.com/watch?v=woROsoPaahQ&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=17",
                    "https://www.youtube.com/watch?v=SKUCiKpDlH4&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=16",
                    "https://www.youtube.com/watch?v=Qf4mDRHZ8bA&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=15",
                    "https://www.youtube.com/watch?v=CVSB3ZSJAAk&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=14",
                    "https://www.youtube.com/watch?v=VlvcELu1JfQ&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=13",
                    "https://www.youtube.com/watch?v=dlGLMNtR93c&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=12",
                    "https://www.youtube.com/watch?v=xF4a33z2vuo&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=11",
                    "https://www.youtube.com/watch?v=GF6y8JanG-o&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=10",
                    "https://www.youtube.com/watch?v=419uspjYxmo&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=9",
                    "https://www.youtube.com/watch?v=BT-TqA6AMYw&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=8",
                    "https://www.youtube.com/watch?v=pTrWzUoOoqs&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=7",
                    "https://www.youtube.com/watch?v=GXWQHfEj6ag&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=6",
                    "https://www.youtube.com/watch?v=ac2w_H0zZyg&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=5",
                    "https://www.youtube.com/watch?v=pXIYg5lXQik&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=4",
                    "https://www.youtube.com/watch?v=Y8xFzDmMGy8&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=3",
                    "https://www.youtube.com/watch?v=PZxnrTqdXWY&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=2",
                    "https://www.youtube.com/watch?v=DreB7qHMaG8&list=PLhbs8A5De9zT8eLPDordVgtluTHhIzSW3&index=1"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_LIFE_ART))
            return new String[]{
                    "https://www.youtube.com/watch?v=a2hcaR-YYZQ&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=31",
                    "https://www.youtube.com/watch?v=LZ47bzsGi7s&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=29",
                    "https://www.youtube.com/watch?v=MgxP2ySM5jM&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=28",
                    "https://www.youtube.com/watch?v=lOuBPnMe29o&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=27",
                    "https://www.youtube.com/watch?v=rMhOXwamjJ4&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=26",
                    "https://www.youtube.com/watch?v=2HOqBq4iDKU&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=25",
                    "https://www.youtube.com/watch?v=2fzOitMp65w&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=23",
                    "https://www.youtube.com/watch?v=wQXzRHKA9eI&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=22",
                    "https://www.youtube.com/watch?v=NjE1va58E1I&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=21",
                    "https://www.youtube.com/watch?v=4gpu5dUY5Aw&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=20",
                    "https://www.youtube.com/watch?v=6GVXLQX9XU4&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=19",
                    "https://www.youtube.com/watch?v=KNz6oBBTLx4&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=18",
                    "https://www.youtube.com/watch?v=vzwVSJDMqoA&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=17",
                    "https://www.youtube.com/watch?v=PJ92y6FNEzA&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=16",
                    "https://www.youtube.com/watch?v=GLbZb05y3Aw&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=15",
                    "https://www.youtube.com/watch?v=o6EHxxYl89M&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=14",
                    "https://www.youtube.com/watch?v=WZu20grk1MU&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=13",
                    "https://www.youtube.com/watch?v=ucOV3rQrGHM&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=12",
                    "https://www.youtube.com/watch?v=bTzZIGllEKU&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=11",
                    "https://www.youtube.com/watch?v=15Bee9ifNx8&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=10",
                    "https://www.youtube.com/watch?v=-rGDYR2DI2c&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=9",
                    "https://www.youtube.com/watch?v=KrSwwSI8KTI&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=8",
                    "https://www.youtube.com/watch?v=6RU8g6bnMcg&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=7",
                    "https://www.youtube.com/watch?v=lV_96slXzmA&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=6",
                    "https://www.youtube.com/watch?v=ChHyLogZukU&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=5",
                    "https://www.youtube.com/watch?v=0f1lY95-FPw&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=4",
                    "https://www.youtube.com/watch?v=uj6dBHA_ekM&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=3",
                    "https://www.youtube.com/watch?v=EZDMpP7Xffg&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=2",
                    "https://www.youtube.com/watch?v=ARH1asJbjXQ&list=PLiJggHtOlnN3lgn1VPSH1Jsf-X90YFggJ&index=1"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_PILGRIMAGE))
            return new String[]{
                    "https://www.youtube.com/watch?v=XV4iBxIQMYc&index=3&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=nlhSARugwog&index=5&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=hvm3SLsFSWA&index=6&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=4ZHd8X7TDx4&index=7&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=UulwfyDSG2Q&index=8&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=qMI6o7dwk5w&index=9&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=RGkM1eoGGpw&index=1&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=Ifr04vlM-aI&index=10&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=AOPaAv8flSM&index=11&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=XcRBBuzzNQ0&index=12&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=SsJr_fkt_I4&index=4&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=ZfbAFclsoWk&index=13&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo",
                    "https://www.youtube.com/watch?v=bgtE25DV9NU&index=14&list=PLhbs8A5De9zSLQaeMBH1anVVcBsktRzuo"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALKAHF))
            return new String[]{
                    "https://www.youtube.com/watch?v=Bn4t0TQ65Ak&index=1&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=i-1YkqGzJ8Q&index=2&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=C-aLw0f4srI&index=3&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=C78Bxm-ID_4&index=4&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=wQ1El-Y6QJY&index=5&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=X5wIIG_FWQM&index=6&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=Ws03toE-k-I&index=7&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=f7PgRBHW_vs&index=8&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=vzF4Nsj_3Zc&index=9&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=EcINaoXWrfk&index=10&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=gylT9Mw0M-U&index=11&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=KIgLPXM8_Ts&index=12&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=E8oyUYUsb0w&index=13&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=SWJVa2M0fWA&index=14&list=PL97B5D4BC482B09FC",
                    "https://www.youtube.com/watch?v=gpg5Rf0GSVs&index=15&list=PL97B5D4BC482B09FC"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALNOUR))
            return new String[]{
                    "https://www.youtube.com/watch?v=x0B5NNj4qG8&list=PL4159269CD3BF5A0C&index=1",
                    "https://www.youtube.com/watch?v=VA7i4kcfTtY&list=PL4159269CD3BF5A0C&index=2",
                    "https://www.youtube.com/watch?v=wKTkZRwro7E&list=PL4159269CD3BF5A0C&index=3",
                    "https://www.youtube.com/watch?v=Kx3cxkngFHQ&list=PL4159269CD3BF5A0C&index=4",
                    "https://www.youtube.com/watch?v=H1Y-EYxCMCk&list=PL4159269CD3BF5A0C&index=5",
                    "https://www.youtube.com/watch?v=92l6As7C7OE&list=PL4159269CD3BF5A0C&index=6",
                    "https://www.youtube.com/watch?v=23l1s7ZlLYg&list=PL4159269CD3BF5A0C&index=7",
                    "https://www.youtube.com/watch?v=A4kCFuXh9dI&list=PL4159269CD3BF5A0C&index=8",
                    "https://www.youtube.com/watch?v=kRRWhBkeD_Q&list=PL4159269CD3BF5A0C&index=9",
                    "https://www.youtube.com/watch?v=RQd3ppQUvF8&list=PL4159269CD3BF5A0C&index=10",
                    "https://www.youtube.com/watch?v=iB2fPaurG0s&list=PL4159269CD3BF5A0C&index=11"
            };

        if (arProgramName.equals(PROGRAM_NAME_AR_MAGIC))
            return new String[]{
                    "https://www.youtube.com/watch?v=1Ip8V-CVKFw",
                    "https://www.youtube.com/watch?v=akuwqgutlI4",
                    "https://www.youtube.com/watch?v=nyfU4aAajF0",
                    "https://www.youtube.com/watch?v=oXBDpDplgW8",
                    "https://www.youtube.com/watch?v=CxGGiI5RMeo",
                    "https://www.youtube.com/watch?v=vY3ccdAhOgw",
                    "https://www.youtube.com/watch?v=AkvwwEeRmbU"
            };

        return null;
    }

    /**
     * this method return resId for an array (which resides in strings.xml) corresponding
     * to the given arProgramName
     *
     * @param arProgramName
     * @return
     */
    static Integer getArrResID(String arProgramName) {
        // TODO (7) this method should return correct array reference for arabic name of the program
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_YUSUF))
            return R.array.thoughts_sura_yusuf;
        if (arProgramName.equals(PROGRAM_NAME_AR_AGE_HARVEST))
            return R.array.age_harvest;
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_YA_SEEN))
            return R.array.thoughts_sura_ya_seen;
        if (arProgramName.equals(PROGRAM_NAME_AR_CONFUSED))
            return R.array.confused;
        if (arProgramName.equals(PROGRAM_NAME_AR_BIOGRAPHY_IS_LIFE))
            return R.array.biography_is_life;
        if (arProgramName.equals(PROGRAM_NAME_AR_LIVE_THE_MOMENT))
            return R.array.live_the_moment;
        if (arProgramName.equals(PROGRAM_NAME_AR_NEW_PERSON))
            return R.array.new_person;
        if (arProgramName.equals(PROGRAM_NAME_AR_REFLECTIONS_10))
            return R.array.reflections_10;
        if (arProgramName.equals(PROGRAM_NAME_AR_REFLECTIONS_11))
            return R.array.reflections_11;
        if (arProgramName.equals(PROGRAM_NAME_AR_FAITH_AND_ERA))
            return R.array.faith_and_era;
        if (arProgramName.equals(PROGRAM_NAME_AR_OMAR_SERIES))
            return R.array.omar_series;
        if (arProgramName.equals(PROGRAM_NAME_AR_THINK))
            return R.array.think;
        if (arProgramName.equals(PROGRAM_NAME_AR_LIFE_ART))
            return R.array.life_art;
        if (arProgramName.equals(PROGRAM_NAME_AR_LIFE_ROAD))
            return R.array.life_road;
        if (arProgramName.equals(PROGRAM_NAME_AR_PILGRIMAGE))
            return R.array.pilgrimage;
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALKAHF))
            return R.array.thoughts_sura_alkahf;
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALNOUR))
            return R.array.thoughts_sura_alnour;
        if (arProgramName.equals(PROGRAM_NAME_AR_THINK_2))
            return R.array.think_2;
        if (arProgramName.equals(PROGRAM_NAME_AR_MESSAGE_FROM_GOD))
            return R.array.message_from_god;
        if (arProgramName.equals(PROGRAM_NAME_AR_PROPHET_OF_MERCY))
            return R.array.prophet_of_mercy;
        if (arProgramName.equals(PROGRAM_NAME_AR_MAGIC))
            return R.array.magic;
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALTAWBA))
            return R.array.thoughts_sura_altawba;
        if (arProgramName.equals(PROGRAM_NAME_AR_THOUGHTS_SURA_ALDOKHAN))
            return R.array.thoughts_sura_aldokhan;
        return null;
    }


    /**
     * this method throws exception if any Arabic program name isn't registered
     * in the hashMaps of the application
     */
    static void checkLstItemsMapping(String[] items) {
        for (int i = 0, N = items.length; i < N; i++) {
            String item = items[i];

            if (isArProgramName(item)) {
                if (PROGRAM_AR_EN_MAP.get(item) == null)
                    throw new RuntimeException(item + " <=> Not registered in PROGRAM_AR_EN_MAP");
                if (PROGRAM_SECTION_MAP.get(item) == null)
                    throw new RuntimeException(item + " <=> Not registered in PROGRAM_SECTION_MAP)");
            }
        }

    }

    /**
     * if the list item begins with — (symbol_title) then it's a section name not a program name
     */
    static boolean isArProgramName(String item) {
        return !item.startsWith(SYMBOL_TITLE);
    }

    /**
     * getting Arabic program name given the last watched program string which consists of
     * sectionName + programName
     */
    static String getArProgramName(String lastWatchedProgram, String[] arProgramsNames) {
        for (String arProgramName : arProgramsNames)
            if (lastWatchedProgram.equals(PROGRAM_SECTION_MAP.get(arProgramName)
                    + PROGRAM_AR_EN_MAP.get(arProgramName)))
                return arProgramName;
        return null;
    }

    /**
     * this method shows a short toast message for the input text
     */
    static void showMessage(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

}
