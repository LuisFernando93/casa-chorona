package interno.mygdx.casachorona.dialogue;

public class DialogueDatabase {

	private static Dialogue[] dialogues = new Dialogue[22];
	
	public static void CreateDialogueDatabase() {
		
		//tentar abrir porta trancada
		Dialogue dialogue = new Dialogue();
		DialogueNode node1 = new DialogueNode("A porta esta trancada.", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[0] = dialogue;
		
		//destrancar porta
		dialogue = new Dialogue();
		node1 = new DialogueNode("A porta foi destrancada!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[1] = dialogue;
		
		//item nao funciona
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso não funciona aqui!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[2] = dialogue;
		
		//pegar lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Olha só, uma lanterna, espero que esteja funcionando.\nTudo aqui tá meio que caindo aos pedaços...", 0);
		DialogueNode node2 = new DialogueNode("Funciona! Com isso, posso enxergar!", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[3] = dialogue;
		
		//interagir novamente com a lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu já peguei a lanterna!\nEla será bem útil!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[4] = dialogue;
		
		//porta trancada da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("A chave está na porta, mas não enxergo nada!", 0);
		node2 = new DialogueNode("Se tivesse uma lanterna, poderia\nver o que estou fazendo.", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[5] = dialogue;
		
		//destranca porta da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("Agora consigo abrir!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[6] = dialogue;
		
		//interage,mas nao pega martelo
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso é bem grande. Eu poderia usar para me\nproteger caso tenha algum cara estranho aqui, né?", 0);
		node2 = new DialogueNode("Nah, não quero levar algo tão pesado.", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[7] = dialogue;
		
		//primeira vez na cena 3
		dialogue = new Dialogue();
		node1 = new DialogueNode("Ah, achei a porta de entrada.", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[8] = dialogue;
		
		//primeira vez na cena 4 - cutscene fanta
		dialogue = new Dialogue();
		node1 = new DialogueNode("!@$!@$HJJK!@$!@K$!@$?!?!?!", 0);
		node2 = new DialogueNode("UM FANTASMA?!?!?!?!?", 1);
		DialogueNode node3 = new DialogueNode("DEUS, POR FAVOR, NÃO ME LEVE AINDA!\nEU NUNCA FIZ NADA DE ERRADO!", 2);
		DialogueNode node4 = new DialogueNode("Tipo, quer dizer, eu meio que invadi a casa", 3);
		DialogueNode node5 = new DialogueNode("MAS EU SÓ QUERIA QUE OS GAROTOS\nGOSTASSEM DE MIM!", 4);
		DialogueNode node6 = new DialogueNode("SENHOR FANTASMA, POR FAVOR,\nNÃO LEVE MINHA ALMA!", 5);
		DialogueNode node7 = new DialogueNode("Fantasma: ...?", 6);
		DialogueNode node8 = new DialogueNode("Fantasma: S-Se acalme por favor,\nnão vou fazer nenhum mal ao senhor.", 7);
		DialogueNode node9 = new DialogueNode("O FANTASMA FALA?!? MEU DEUS, MEU SENHOR,\nME AJUDA POR FAVOR.", 8);
		DialogueNode node10 = new DialogueNode("Calma, calma, se acalme.", 9);
		DialogueNode node11 = new DialogueNode("Fantasma: Mas eu estou calmo.", 10);
		DialogueNode node12 = new DialogueNode("To falando comigo mesmo, fica quieto aí.", 11);
		DialogueNode node13 = new DialogueNode("RESPIRA, inspira, RESPIRA, inspira.", 12);
		DialogueNode node14 = new DialogueNode("Fantasma: Melhor?", 13);
		DialogueNode node15 = new DialogueNode("Acho que sim... Então, tu não vai me assombrar não?", 14);
		DialogueNode node16 = new DialogueNode("Fantasma: ...Não.", 15);
		DialogueNode node17 = new DialogueNode("Opa, é isso então, vou meter o pé, jaé?", 16);
		DialogueNode node18 = new DialogueNode("Fantasma: C-Calma!", 17);
		DialogueNode node19 = new DialogueNode("...", 18);
		DialogueNode node20 = new DialogueNode("Fantasma: V-Você é a primeira pessoa que aparece\naqui em muito tempo... você poderia me ajudar?", 19);
		DialogueNode node21 = new DialogueNode("To com cara de exorcista agora menor?", 20);
		DialogueNode node22 = new DialogueNode("Fantasma: ... Seu comportamento mudou rápido demais.", 21);
		DialogueNode node23 = new DialogueNode("Sou altamente adaptativo, sabe.", 22);
		DialogueNode node24 = new DialogueNode("Fantasma: ...", 23);
		DialogueNode node25 = new DialogueNode("Fantasma: Entendo... tudo bem, pode ir,\nvou continuar aqui então...", 24);
		DialogueNode node26 = new DialogueNode("Fantasma: Sozinho e no escuro, me perguntando\no porquê estou preso aqui...", 25);
		DialogueNode node27 = new DialogueNode("Fantasma: Talvez daqui a 50 anos alguém venha me ajudar...", 26);
		DialogueNode node28 = new DialogueNode("...", 27);
		DialogueNode node29 = new DialogueNode("Chantagem emocional?", 28);
		DialogueNode node30 = new DialogueNode("Droga, agora eu estou me sentindo mal...", 29);
		DialogueNode node31 = new DialogueNode("Fantasma: Hehe", 30);
		DialogueNode node32 = new DialogueNode("\"Hehe\" é o escambau viu, manda logo o\npapo antes que eu mude de ideia.", 31);
		DialogueNode node33 = new DialogueNode("Fantasma: Então o senhor vai me ajudar?", 32);
		DialogueNode node34 = new DialogueNode("Sim sim.", 33);
		DialogueNode node35 = new DialogueNode("Fantasma: Jura?!?", 34);
		DialogueNode node36 = new DialogueNode("Já falei que sim.", 35);
		DialogueNode node37 = new DialogueNode("Imagino que quer seguir em frente ou algo assim né?", 36);
		DialogueNode node38 = new DialogueNode("Fantasma: Ah, sim.", 37);
		DialogueNode node39 = new DialogueNode("Fantasma: Então, eu não sei o que aconteceu comigo,\nmas eu acho que morri.", 38);
		DialogueNode node40 = new DialogueNode("Ava. Se não tivesse falado eu não teria percebido.", 39);
		DialogueNode node41 = new DialogueNode("Morreu do que?", 40);
		DialogueNode node42 = new DialogueNode("Fantasma: Não sei. Eu eventualmente só acordei\naqui do nada e já estava assim", 41);
		DialogueNode node43 = new DialogueNode("...", 42);
		DialogueNode node44 = new DialogueNode("Foda.", 43);
		DialogueNode node45 = new DialogueNode("Bem, seguindo a lógica dos filmes, você deve ter algum\narrependimento ou algo assim...", 44);
		DialogueNode node46 = new DialogueNode("Mas se você não lembra de nada, talvez seu\narrependimento seja a causa da sua morte?", 45);
		DialogueNode node47 = new DialogueNode("Fantasma: ... talvez...?", 46);
		DialogueNode node48 = new DialogueNode("Tá, vamo dar um role na casa, vai que a gente\nencontra algo.", 47);
		DialogueNode node49 = new DialogueNode("Fantasma: ... role? Você fala de um jeito engraçado.", 48);
		DialogueNode node50 = new DialogueNode("Fantasma: Por sinal, qual o nome do senhor?", 49);
		DialogueNode node51 = new DialogueNode("Primeiro, não me chama de senhor, fico parecendo\num véio. Tenho só 16 anos bele?", 50);
		DialogueNode node52 = new DialogueNode("Meu nome é Alexander, mas pode me chamar de\nAlek mesmo.", 51);
		DialogueNode node53 = new DialogueNode("Alek: E o seu nome?", 52);
		DialogueNode node54 = new DialogueNode("Fantasma: ... Não sei", 53);
		DialogueNode node55 = new DialogueNode("Alek: ...", 54);
		DialogueNode node56 = new DialogueNode("Alek: Ok, eu sou bom em dar nome às coisas.", 55);
		DialogueNode node57 = new DialogueNode("Alek: Seu nome agora é... Fanta. Porque você é um\nfantasma e tals.", 56);
		DialogueNode node58 = new DialogueNode("Fanta: ...", 57);
		DialogueNode node59 = new DialogueNode("Fanta: Isso não é nome de refrigerante?", 58);
		DialogueNode node60 = new DialogueNode("Alek: Calado.", 59);
		node60.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		dialogue.addDialogueNode(node13);
		dialogue.addDialogueNode(node14);
		dialogue.addDialogueNode(node15);
		dialogue.addDialogueNode(node16);
		dialogue.addDialogueNode(node17);
		dialogue.addDialogueNode(node18);
		dialogue.addDialogueNode(node19);
		dialogue.addDialogueNode(node20);
		dialogue.addDialogueNode(node21);
		dialogue.addDialogueNode(node22);
		dialogue.addDialogueNode(node23);
		dialogue.addDialogueNode(node24);
		dialogue.addDialogueNode(node25);
		dialogue.addDialogueNode(node26);
		dialogue.addDialogueNode(node27);
		dialogue.addDialogueNode(node28);
		dialogue.addDialogueNode(node29);
		dialogue.addDialogueNode(node30);
		dialogue.addDialogueNode(node31);
		dialogue.addDialogueNode(node32);
		dialogue.addDialogueNode(node33);
		dialogue.addDialogueNode(node34);
		dialogue.addDialogueNode(node35);
		dialogue.addDialogueNode(node36);
		dialogue.addDialogueNode(node37);
		dialogue.addDialogueNode(node38);
		dialogue.addDialogueNode(node39);
		dialogue.addDialogueNode(node40);
		dialogue.addDialogueNode(node41);
		dialogue.addDialogueNode(node42);
		dialogue.addDialogueNode(node43);
		dialogue.addDialogueNode(node44);
		dialogue.addDialogueNode(node45);
		dialogue.addDialogueNode(node46);
		dialogue.addDialogueNode(node47);
		dialogue.addDialogueNode(node48);
		dialogue.addDialogueNode(node49);
		dialogue.addDialogueNode(node50);
		dialogue.addDialogueNode(node51);
		dialogue.addDialogueNode(node52);
		dialogue.addDialogueNode(node53);
		dialogue.addDialogueNode(node54);
		dialogue.addDialogueNode(node55);
		dialogue.addDialogueNode(node56);
		dialogue.addDialogueNode(node57);
		dialogue.addDialogueNode(node58);
		dialogue.addDialogueNode(node59);
		dialogue.addDialogueNode(node60);
		DialogueDatabase.dialogues[9] = dialogue;
		
		//primeira vez na cena 5
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Você é meio pequeno, será que você é uma\ncriança?", 0);
		node2 = new DialogueNode("Fanta: Acho que sim.", 1);
		node3 = new DialogueNode("Alek: Poxa. Deve ser uma merda morrer cedo e\ndepois ficar preso em um lugar assim.", 2);
		node4 = new DialogueNode("Fanta: ...", 3);
		node5 = new DialogueNode("Alek: Não se preocupa maninho, prometi que ia\nte ajudar, não é?", 4);
		node6 = new DialogueNode("Fanta: ... Sim... Obrigado.", 5);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[10] = dialogue;
		
		//primeira vez na cena 6
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Uou...", 0);
		node2 = new DialogueNode("Alek: Sabe, não sou muito de acreditar nessas coisas,\nmas a atmosfera desse lugar é meio... pesada.", 1);
		node3 = new DialogueNode("Fanta: ... Sim, eu não gosto de ficar aqui.", 2);
		node4 = new DialogueNode("Fanta: Eu me sinto... sufocado.", 3);
		node5 = new DialogueNode("Alek: Não precisa se esforçar muito cara, eu posso dar\numa olhada aqui sozinho.", 4);
		node6 = new DialogueNode("Fanta: Não. Está tudo bem, eu aguento.", 5);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[11] = dialogue;
		
		//primera vez na cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Aqui tem cara de suite principal.", 0);
		node2 = new DialogueNode("Alek: Seus pais deveriam dormir aqui.", 1);
		node3 = new DialogueNode("Fanta: É, talvez.", 2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[12] = dialogue;
		
		//primeira vez na cena 8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Aqui é menos assustador do que eu pensei.", 0);
		node2 = new DialogueNode("Alek: Quando eu entrei o tempo estava meio fechado, mas\nagora até que está um pôr do sol bonito", 1);
		node3 = new DialogueNode("Fanta: ...", 2);
		node4 = new DialogueNode("Alek: Tudo bem irmão?", 3);
		node5 = new DialogueNode("Fanta: Aqui. Tem algo aqui. Eu consigo sentir.", 4);
		node6 = new DialogueNode("Alek: Parece que chegamos na fase final então. Vamos\nresolver isso logo.", 5);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[13] = dialogue;
		
		//primeira vez na cena 9
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Ok, isso definitivamente é o quarto de uma criança,\nentão deve ser o seu quarto.", 0);
		node2 = new DialogueNode("Fanta: Bem, aqui é o lugar que eu me sinto mais confortável.", 1);
		node3 = new DialogueNode("Alek: Vamos dar uma atenção especial aqui então.", 2);
		node4 = new DialogueNode("Alek: Aposto que vamos descobrir algo se mexermos\nem tudo aqui.", 3);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[14] = dialogue;
		
		//pegando a chave do escritorio, na cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bem, não vi sinais de que tenha alguém aqui dentro,\nessas bebidas espalhadas pela casa são dos antigos moradores então?", 0);
		node2 = new DialogueNode("Fanta: ...", 1);
		node3 = new DialogueNode("Fanta: Acho que lembro de alguém bebendo muito e\nfalando alto.", 2);
		node4 = new DialogueNode("Alek: Vou dar uma olhada nas gavetas também.\nVai que acho algo.", 3);
		node5 = new DialogueNode("Alek: Uma chave!, será que é do quarto da sala?", 4);
		node6 = new DialogueNode("Fanta: É... parece que sim.", 5);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[15] = dialogue;
		
		//mexendo na comoda, tendo a chave, na cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bem, não vi sinais de que tenha alguém aqui dentro,\nessas bebidas espalhadas pela casa são dos antigos moradores então?", 0);
		node2 = new DialogueNode("Fanta: ...", 1);
		node3 = new DialogueNode("Fanta: Acho que lembro de alguém bebendo muito e\nfalando alto.", 2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[16] = dialogue;
		
		//cena 9 cama
		
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: AAAAAA eu sempre quis uma cama assim quando era\npequeno, pena que era cara.", 0);
		node2 = new DialogueNode("Fanta: Ela é muito confortável, deita aí.", 1);
		node3 = new DialogueNode("Alek: Opa, ok.", 2);
		node4 = new DialogueNode("*Pula de cara na cama*", 3);
		node5 = new DialogueNode("Alek: /@?!@?E$/??", 4);
		node6 = new DialogueNode("*sai da cama*", 5);
		node7 = new DialogueNode("Alek: *cof* *cof*", 6);
		node8 = new DialogueNode("Alek: QUE ISSO? Cama toda dura, cheia de poeira,\nestou sentindo algo dentro da minha roupa!", 7);
		node9 = new DialogueNode("Alek:  VOCÊ DISSE QUE ERA CONFORTÁVEL!", 8);
		node10 = new DialogueNode("Fanta: HEHEHEHEHEHEHE", 9);
		node11 = new DialogueNode("Fanta: Como eu ia saber se era ou não?\nEu sou um fantasma.", 10);
		node12 = new DialogueNode("Alek: Tá cheio das piadoca agora hein.", 11);
		node13 = new DialogueNode("Fanta: Mas... Ela realmente era confortável.\nEu me sentia tão bem nela...", 12);
		node14 = new DialogueNode("Fanta: Lembro que alguém me contava histórias toda\nnoite... Para onde essa pessoa foi?", 13);
		node15 = new DialogueNode("Alek: ... Tudo bem amiguinho?", 14);
		node16 = new DialogueNode("Fanta: Sim. Está tudo bem.", 15);
		node16.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		dialogue.addDialogueNode(node13);
		dialogue.addDialogueNode(node14);
		dialogue.addDialogueNode(node15);
		dialogue.addDialogueNode(node16);
		DialogueDatabase.dialogues[17] = dialogue;
		
		//cena 9 tenda
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Mas que diabos é isso? Gente rica\né esquisita demais.", 0);
		node2 = new DialogueNode("Fanta: É minha tenda, era super divertido\nbrincar aqui!", 1);
		node3 = new DialogueNode("Alek: Era?", 2);
		node4 = new DialogueNode("Fanta: SIM! Eu lembro que era um dos meus\nesconderijos favoritos, quando eu ficava aqui, a mamã-", 3);
		node5 = new DialogueNode("Fanta: ...", 4);
		node6 = new DialogueNode("Fanta: M-Minha cabeça dói. Eu estava quase\nme lembrando... Por que...?", 5);
		node7 = new DialogueNode("Alek: Calma calma, fica tranquilo, a gente\ntem tempo, vamos lembrar de tudo, ok?", 6);
		node8 = new DialogueNode("Fanta: ... Ok", 7);
		node8.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		DialogueDatabase.dialogues[18] = dialogue;
		
		//cena 9 poster
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: .. Sério, sem comentários.", 0);
		node2 = new DialogueNode("Fanta: Você gosta de criticar minhas\ncoisas né?", 1);
		node3 = new DialogueNode("Alek: Claro, mó gosto merda.", 2);
		node4 = new DialogueNode("Fanta: ...", 3);
		node5 = new DialogueNode("Fanta: Ele foi um presente... um presente\nque eu gostei muito... era... meu aniversário?", 4);
		node6 = new DialogueNode("Alek: Sei não bro, quem daria essa coisa\nbizarra para uma criança? Seloko.", 5);
		node7 = new DialogueNode("Alek: Lembra da data pelo menos?", 6);
		node8 = new DialogueNode("Fanta: Não...", 7);
		node8.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		DialogueDatabase.dialogues[19] = dialogue;
		
		//cena 9 bau
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Espero que tenha loot dentro.", 0);
		node2 = new DialogueNode("Alek: Se bem que do jeito que essa casa é\nbizarra, capaz de ter um esqueleto aqui.", 1);
		node3 = new DialogueNode("*abre*", 2);
		node4 = new DialogueNode("Alek: Muitas coisas. Figurinhas, bonecos de ação,\ncarrinhos, pião. Você era uma criança feliz pelo visto.", 3);
		node5 = new DialogueNode("Fanta: Sim, eu lembro que brincava bastante aqui.\nMas isso é estranho, lembro de um baú, mas não era esse.", 4);
		node6 = new DialogueNode("Alek: Por que acha isso?", 5);
		node7 = new DialogueNode("Fanta: Eu lembro que ele era maior, grande a ponto de\neu conseguir deitar dentro dele se me espremesse um pouquinho.", 6);
		node8 = new DialogueNode("Alek: Por que você entraria em um baú meu fi?", 7);
		node9 = new DialogueNode("Fanta: Para brincar com o papai.", 8);
		node10 = new DialogueNode("Fanta: Pa-Papai", 9);
		node11 = new DialogueNode("Alek: Ei ei ei, que foi, você começou\na chorar mais que o normal!", 10);
		node12 = new DialogueNode("Fanta: T-Tá t-tudo b-bem... E-Eu s-só\np-preciso d-descansar u-um p-pouco.", 11);
		node12.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		DialogueDatabase.dialogues[20] = dialogue;
		
		//cena 9 recebe senha
		dialogue = new Dialogue();
		node1 = new DialogueNode("Fanta: Eu consigo lembrar agora.", 0);
		node2 = new DialogueNode("Fanta: Eu realmente vivia aqui com meu pai e\nminha mãe, essa era a nossa casa.", 1);
		node3 = new DialogueNode("Fanta: A gente era muito feliz, nos divertimos\nmuito todo dia.", 2);
		node4 = new DialogueNode("Fanta: Lembro que o Papai trabalhava bastante e\na Mamãe ficava aqui em casa todos os dias comigo.", 3);
		node5 = new DialogueNode("Fanta: Mas eventualmente algo mudou...", 4);
		node6 = new DialogueNode("Alek: O que?", 5);
		node7 = new DialogueNode("Fanta: Não sei direito ainda.", 6);
		node8 = new DialogueNode("Alek: Tudo bem, nós vamos descobrir logo.\nLembra de mais alguma coisa importante?", 7);
		node9 = new DialogueNode("Fanta: ...", 8);
		node10 = new DialogueNode("Fanta: Meu aniversário. 15/03/1985", 9);
		node11 = new DialogueNode("Alek: ... Faz realmente muito tempo que tudo aconteceu então.", 10);
		node12 = new DialogueNode("Alek: Bem, se eles eram pais tão bons assim,\nessa pode ser a senha de algo, vou anotar aqui.", 11);
		node13 = new DialogueNode("Fanta: Sim, provavelmente.", 12);
		node13.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		dialogue.addDialogueNode(node13);
		DialogueDatabase.dialogues[21] = dialogue;
	}
	
	public static Dialogue getDialogue(int id) {
		return DialogueDatabase.dialogues[id];
	}
}
