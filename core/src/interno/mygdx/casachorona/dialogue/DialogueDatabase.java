package interno.mygdx.casachorona.dialogue;

public class DialogueDatabase {

	private static Dialogue[] dialogues = new Dialogue[28];
	
	public static void CreateDialogueDatabase() {
		
		//tentar abrir porta trancada
		Dialogue dialogue = new Dialogue();
		DialogueNode node1 = new DialogueNode("A porta esta trancada.", 0, 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[0] = dialogue;
		
		//destrancar porta
		dialogue = new Dialogue();
		node1 = new DialogueNode("A porta foi destrancada!", 0, 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[1] = dialogue;
		
		//item nao funciona
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso n�o funciona aqui!", 0, 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[2] = dialogue;
		
		//pegar lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Olha s�, uma lanterna, espero que esteja funcionando.\nTudo aqui t� meio que caindo aos peda�os...", 0, 1);
		DialogueNode node2 = new DialogueNode("Funciona! Com isso, posso enxergar!", 1, 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[3] = dialogue;
		
		//interagir novamente com a lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu j� peguei a lanterna!\nEla ser� bem �til!", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[4] = dialogue;
		
		//porta trancada da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("A chave est� na porta, mas n�o enxergo nada!", 0, 1);
		node2 = new DialogueNode("Se tivesse uma lanterna, poderia\nver o que estou fazendo.", 1, 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[5] = dialogue;
		
		//destranca porta da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("Agora consigo abrir!", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[6] = dialogue;
		
		//interage,mas nao pega martelo
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso � bem grande. Eu poderia usar para me\nproteger caso tenha algum cara estranho aqui, n�?", 0,1);
		node2 = new DialogueNode("Nah, n�o quero levar algo t�o pesado.", 1,1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[7] = dialogue;
		
		//primeira vez na cena 3
		dialogue = new Dialogue();
		node1 = new DialogueNode("Ah, achei a porta de entrada.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[8] = dialogue;
		
		//primeira vez na cena 4 - cutscene fanta
		dialogue = new Dialogue();
		node1 = new DialogueNode("!@$!@$HJJK!@$!@K$!@$?!?!?!", 0);
		node2 = new DialogueNode("UM FANTASMA?!?!?!?!?", 1);
		DialogueNode node3 = new DialogueNode("DEUS, POR FAVOR, N�O ME LEVE AINDA!\nEU NUNCA FIZ NADA DE ERRADO!", 2);
		DialogueNode node4 = new DialogueNode("Tipo, quer dizer, eu meio que invadi a casa", 3);
		DialogueNode node5 = new DialogueNode("MAS EU S� QUERIA QUE OS GAROTOS\nGOSTASSEM DE MIM!", 4);
		DialogueNode node6 = new DialogueNode("SENHOR FANTASMA, POR FAVOR,\nN�O LEVE MINHA ALMA!", 5);
		DialogueNode node7 = new DialogueNode("Fantasma: ...?", 6,2);
		DialogueNode node8 = new DialogueNode("Fantasma: S-Se acalme por favor,\nn�o vou fazer nenhum mal ao senhor.", 7,2);
		DialogueNode node9 = new DialogueNode("O FANTASMA FALA?!? MEU DEUS, MEU SENHOR,\nME AJUDA POR FAVOR.", 8);
		DialogueNode node10 = new DialogueNode("Calma, calma, se acalme.", 9);
		DialogueNode node11 = new DialogueNode("Fantasma: Mas eu estou calmo.", 10,2);
		DialogueNode node12 = new DialogueNode("To falando comigo mesmo, fica quieto a�.", 11);
		DialogueNode node13 = new DialogueNode("RESPIRA, inspira, RESPIRA, inspira.", 12);
		DialogueNode node14 = new DialogueNode("Fantasma: Melhor?", 13,2);
		DialogueNode node15 = new DialogueNode("Acho que sim... Ent�o, tu n�o vai me assombrar n�o?", 14);
		DialogueNode node16 = new DialogueNode("Fantasma: ...N�o.", 15,2);
		DialogueNode node17 = new DialogueNode("Opa, � isso ent�o, vou meter o p�, ja�?", 16);
		DialogueNode node18 = new DialogueNode("Fantasma: C-Calma!", 17,2);
		DialogueNode node19 = new DialogueNode("...", 18);
		DialogueNode node20 = new DialogueNode("Fantasma: V-Voc� � a primeira pessoa que aparece\naqui em muito tempo... voc� poderia me ajudar?", 19,2);
		DialogueNode node21 = new DialogueNode("To com cara de exorcista agora menor?", 20);
		DialogueNode node22 = new DialogueNode("Fantasma: ... Seu comportamento mudou r�pido demais.", 21,2);
		DialogueNode node23 = new DialogueNode("Sou altamente adaptativo, sabe.", 22);
		DialogueNode node24 = new DialogueNode("Fantasma: ...", 23,2);
		DialogueNode node25 = new DialogueNode("Fantasma: Entendo... tudo bem, pode ir,\nvou continuar aqui ent�o...", 24,2);
		DialogueNode node26 = new DialogueNode("Fantasma: Sozinho e no escuro, me perguntando\no porqu� estou preso aqui...", 25,2);
		DialogueNode node27 = new DialogueNode("Fantasma: Talvez daqui a 50 anos algu�m venha me ajudar...", 26,2);
		DialogueNode node28 = new DialogueNode("...", 27);
		DialogueNode node29 = new DialogueNode("Chantagem emocional?", 28);
		DialogueNode node30 = new DialogueNode("Droga, agora eu estou me sentindo mal...", 29);
		DialogueNode node31 = new DialogueNode("Fantasma: Hehe", 30,2);
		DialogueNode node32 = new DialogueNode("\"Hehe\" � o escambau viu, manda logo o\npapo antes que eu mude de ideia.", 31);
		DialogueNode node33 = new DialogueNode("Fantasma: Ent�o o senhor vai me ajudar?", 32,2);
		DialogueNode node34 = new DialogueNode("Sim sim.", 33);
		DialogueNode node35 = new DialogueNode("Fantasma: Jura?!?", 34,2);
		DialogueNode node36 = new DialogueNode("J� falei que sim.", 35);
		DialogueNode node37 = new DialogueNode("Imagino que quer seguir em frente ou algo assim n�?", 36);
		DialogueNode node38 = new DialogueNode("Fantasma: Ah, sim.", 37,2);
		DialogueNode node39 = new DialogueNode("Fantasma: Ent�o, eu n�o sei o que aconteceu comigo,\nmas eu acho que morri.", 38,2);
		DialogueNode node40 = new DialogueNode("Ava. Se n�o tivesse falado eu n�o teria percebido.", 39);
		DialogueNode node41 = new DialogueNode("Morreu do que?", 40);
		DialogueNode node42 = new DialogueNode("Fantasma: N�o sei. Eu eventualmente s� acordei\naqui do nada e j� estava assim.", 41,2);
		DialogueNode node43 = new DialogueNode("...", 42);
		DialogueNode node44 = new DialogueNode("Foda.", 43);
		DialogueNode node45 = new DialogueNode("Bem, seguindo a l�gica dos filmes, voc� deve ter algum\narrependimento ou algo assim...", 44);
		DialogueNode node46 = new DialogueNode("Mas se voc� n�o lembra de nada, talvez seu\narrependimento seja a causa da sua morte?", 45);
		DialogueNode node47 = new DialogueNode("Fantasma: ... talvez...?", 46,2);
		DialogueNode node48 = new DialogueNode("T�, vamo dar um role na casa, vai que a gente\nencontra algo.", 47);
		DialogueNode node49 = new DialogueNode("Fantasma: ... role? Voc� fala de um jeito engra�ado.", 48,2);
		DialogueNode node50 = new DialogueNode("Fantasma: Por sinal, qual o nome do senhor?", 49,2);
		DialogueNode node51 = new DialogueNode("Primeiro, n�o me chama de senhor, fico parecendo\num v�io. Tenho s� 16 anos bele?", 50);
		DialogueNode node52 = new DialogueNode("Meu nome � Alexander, mas pode me chamar de\nAlek mesmo.", 51);
		DialogueNode node53 = new DialogueNode("Alek: E o seu nome?", 52);
		DialogueNode node54 = new DialogueNode("Fantasma: ... N�o sei", 53,2);
		DialogueNode node55 = new DialogueNode("Alek: ...", 54);
		DialogueNode node56 = new DialogueNode("Alek: Ok, eu sou bom em dar nome �s coisas.", 55);
		DialogueNode node57 = new DialogueNode("Alek: Seu nome agora �... Fanta. Porque voc� � um\nfantasma e tals.", 56);
		DialogueNode node58 = new DialogueNode("Fanta: ...", 57,2);
		DialogueNode node59 = new DialogueNode("Fanta: Isso n�o � nome de refrigerante?", 58,2);
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
		node1 = new DialogueNode("Alek: Voc� � meio pequeno, ser� que voc� � uma\ncrian�a?", 0);
		node2 = new DialogueNode("Fanta: Acho que sim.", 1,2);
		node3 = new DialogueNode("Alek: Poxa. Deve ser uma merda morrer cedo e\ndepois ficar preso em um lugar assim.", 2);
		node4 = new DialogueNode("Fanta: ...", 3,2);
		node5 = new DialogueNode("Alek: N�o se preocupa maninho, prometi que ia\nte ajudar, n�o �?", 4);
		node6 = new DialogueNode("Fanta: ... Sim... Obrigado.", 5,2);
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
		node2 = new DialogueNode("Alek: Sabe, n�o sou muito de acreditar nessas coisas,\nmas a atmosfera desse lugar � meio... pesada.", 1);
		node3 = new DialogueNode("Fanta: ... Sim, eu n�o gosto de ficar aqui.", 2,2);
		node4 = new DialogueNode("Fanta: Eu me sinto... sufocado.", 3,2);
		node5 = new DialogueNode("Alek: N�o precisa se esfor�ar muito cara, eu posso dar\numa olhada aqui sozinho.", 4);
		node6 = new DialogueNode("Fanta: N�o. Est� tudo bem, eu aguento.", 5,2);
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
		node3 = new DialogueNode("Fanta: �, talvez.", 2,2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[12] = dialogue;
		
		//primeira vez na cena 8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Aqui � menos assustador do que eu pensei.", 0);
		node2 = new DialogueNode("Alek: Quando eu entrei o tempo estava meio fechado, mas\nagora at� que est� um p�r do sol bonito", 1);
		node3 = new DialogueNode("Fanta: ...", 2,2);
		node4 = new DialogueNode("Alek: Tudo bem irm�o?", 3);
		node5 = new DialogueNode("Fanta: Aqui. Tem algo aqui. Eu consigo sentir.", 4,2);
		node6 = new DialogueNode("Alek: Parece que chegamos na fase final ent�o. Vamos\nresolver isso logo.", 5);
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
		node1 = new DialogueNode("Alek: Ok, isso definitivamente � o quarto de uma crian�a,\nent�o deve ser o seu quarto.", 0);
		node2 = new DialogueNode("Fanta: Bem, aqui � o lugar que eu me sinto mais confort�vel.", 1,2);
		node3 = new DialogueNode("Alek: Vamos dar uma aten��o especial aqui ent�o.", 2);
		node4 = new DialogueNode("Alek: Aposto que vamos descobrir algo se mexermos\nem tudo aqui.", 3);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[14] = dialogue;
		
		//pegando a chave do escritorio, na cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bem, n�o vi sinais de que tenha algu�m aqui dentro,\nessas bebidas espalhadas pela casa s�o dos antigos moradores ent�o?", 0);
		node2 = new DialogueNode("Fanta: ...", 1,2);
		node3 = new DialogueNode("Fanta: Acho que lembro de algu�m bebendo muito e\nfalando alto.", 2,2);
		node4 = new DialogueNode("Alek: Vou dar uma olhada nas gavetas tamb�m.\nVai que acho algo.", 3);
		node5 = new DialogueNode("Alek: Uma chave!, ser� que � do quarto da sala?", 4);
		node6 = new DialogueNode("Fanta: �... parece que sim.", 5,2);
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
		node1 = new DialogueNode("Alek: Bem, n�o vi sinais de que tenha algu�m aqui dentro,\nessas bebidas espalhadas pela casa s�o dos antigos moradores ent�o?", 0);
		node2 = new DialogueNode("Fanta: ...", 1,2);
		node3 = new DialogueNode("Fanta: Acho que lembro de algu�m bebendo muito e\nfalando alto.", 2,2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[16] = dialogue;
		
		//cena 9 cama
		
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: AAAAAA eu sempre quis uma cama assim quando era\npequeno, pena que era cara.", 0);
		node2 = new DialogueNode("Fanta: Ela � muito confort�vel, deita a�.", 1,2);
		node3 = new DialogueNode("Alek: Opa, ok.", 2);
		node4 = new DialogueNode("*Pula de cara na cama*", 3);
		node5 = new DialogueNode("Alek: /@?!@?E$/??", 4);
		node6 = new DialogueNode("*sai da cama*", 5);
		node7 = new DialogueNode("Alek: *cof* *cof*", 6);
		node8 = new DialogueNode("Alek: QUE ISSO? Cama toda dura, cheia de poeira,\nestou sentindo algo dentro da minha roupa!", 7);
		node9 = new DialogueNode("Alek:  VOC� DISSE QUE ERA CONFORT�VEL!", 8);
		node10 = new DialogueNode("Fanta: HEHEHEHEHEHEHE", 9,2);
		node11 = new DialogueNode("Fanta: Como eu ia saber se era ou n�o?\nEu sou um fantasma.", 10,2);
		node12 = new DialogueNode("Alek: T� cheio das piadoca agora hein.", 11);
		node13 = new DialogueNode("Fanta: Mas... Ela realmente era confort�vel.\nEu me sentia t�o bem nela...", 12,2);
		node14 = new DialogueNode("Fanta: Lembro que algu�m me contava hist�rias toda\nnoite... Para onde essa pessoa foi?", 13,2);
		node15 = new DialogueNode("Alek: ... Tudo bem amiguinho?", 14);
		node16 = new DialogueNode("Fanta: Sim. Est� tudo bem.", 15,2);
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
		node1 = new DialogueNode("Alek: Mas que diabos � isso? Gente rica\n� esquisita demais.", 0);
		node2 = new DialogueNode("Fanta: � minha tenda, era super divertido\nbrincar aqui!", 1,2);
		node3 = new DialogueNode("Alek: Era?", 2);
		node4 = new DialogueNode("Fanta: SIM! Eu lembro que era um dos meus\nesconderijos favoritos, quando eu ficava aqui, a mam�-", 3,2);
		node5 = new DialogueNode("Fanta: ...", 4,2);
		node6 = new DialogueNode("Fanta: M-Minha cabe�a d�i. Eu estava quase\nme lembrando... Por que...?", 5,2);
		node7 = new DialogueNode("Alek: Calma calma, fica tranquilo, a gente\ntem tempo, vamos lembrar de tudo, ok?", 6);
		node8 = new DialogueNode("Fanta: ... Ok", 7,2);
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
		node1 = new DialogueNode("Alek: .. S�rio, sem coment�rios.", 0);
		node2 = new DialogueNode("Fanta: Voc� gosta de criticar minhas\ncoisas n�?", 1,2);
		node3 = new DialogueNode("Alek: Claro, m� gosto merda.", 2);
		node4 = new DialogueNode("Fanta: ...", 3,2);
		node5 = new DialogueNode("Fanta: Ele foi um presente... um presente\nque eu gostei muito... era... meu anivers�rio?", 4,2);
		node6 = new DialogueNode("Alek: Sei n�o bro, quem daria essa coisa\nbizarra para uma crian�a? Seloko.", 5);
		node7 = new DialogueNode("Alek: Lembra da data pelo menos?", 6);
		node8 = new DialogueNode("Fanta: N�o...", 7,2);
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
		node2 = new DialogueNode("Alek: Se bem que do jeito que essa casa �\nbizarra, capaz de ter um esqueleto aqui.", 1);
		node3 = new DialogueNode("*abre*", 2);
		node4 = new DialogueNode("Alek: Muitas coisas. Figurinhas, bonecos de a��o,\ncarrinhos, pi�o. Voc� era uma crian�a feliz pelo visto.", 3);
		node5 = new DialogueNode("Fanta: Sim, eu lembro que brincava bastante aqui.\nMas isso � estranho, lembro de um ba�, mas n�o era esse.", 4,2);
		node6 = new DialogueNode("Alek: Por que acha isso?", 5);
		node7 = new DialogueNode("Fanta: Eu lembro que ele era maior, grande a ponto de\neu conseguir deitar dentro dele se me espremesse um pouquinho.", 6,2);
		node8 = new DialogueNode("Alek: Por que voc� entraria em um ba� meu fi?", 7);
		node9 = new DialogueNode("Fanta: Para brincar com o papai.", 8,2);
		node10 = new DialogueNode("Fanta: Pa-Papai", 9,2);
		node11 = new DialogueNode("Alek: Ei ei ei, que foi, voc� come�ou\na chorar mais que o normal!", 10);
		node12 = new DialogueNode("Fanta: T-T� t-tudo b-bem... E-Eu s-s�\np-preciso d-descansar u-um p-pouco.", 11,2);
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
		node1 = new DialogueNode("Fanta: Eu consigo lembrar agora.", 0,2);
		node2 = new DialogueNode("Fanta: Eu realmente vivia aqui com meu pai e\nminha m�e, essa era a nossa casa.", 1,2);
		node3 = new DialogueNode("Fanta: A gente era muito feliz, nos divertimos\nmuito todo dia.", 2,2);
		node4 = new DialogueNode("Fanta: Lembro que o Papai trabalhava bastante e\na Mam�e ficava aqui em casa todos os dias comigo.", 3,2);
		node5 = new DialogueNode("Fanta: Mas eventualmente algo mudou...", 4,2);
		node6 = new DialogueNode("Alek: O que?", 5);
		node7 = new DialogueNode("Fanta: N�o sei direito ainda.", 6,2);
		node8 = new DialogueNode("Alek: Tudo bem, n�s vamos descobrir logo.\nLembra de mais alguma coisa importante?", 7);
		node9 = new DialogueNode("Fanta: ...", 8,2);
		node10 = new DialogueNode("Fanta: Meu anivers�rio. 15/03/1985", 9,2);
		node11 = new DialogueNode("Alek: ... Faz realmente muito tempo que tudo aconteceu ent�o.", 10);
		node12 = new DialogueNode("Alek: Bem, se eles eram pais t�o bons assim,\nessa pode ser a senha de algo. Vou anotar aqui.", 11);
		node13 = new DialogueNode("Fanta: Sim, provavelmente.", 12,2);
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
		
		//cena6 cofre sem senha
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Um cofre... Esse � um modelo bem antigo.\nNa casa dos meus av�s tem um desse.", 0);
		node2 = new DialogueNode("Alek: A senha deve ter 4 d�gitos.", 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[22] = dialogue;
		
		//cena6 cofre abre
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Abriu! Vamos ver o que tem ai...", 0);
		node2 = new DialogueNode("Alek: Uma chave? Deve ser do sot�o", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[23] = dialogue;
		
		//cena6 cofre vazio
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: N�o tem mais nada de valor a�.", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[24] = dialogue;
		
		//cena8 bau sem marreta
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Um ba�... trancado...", 0);
		node2 = new DialogueNode("Alek: Eu n�o vou achar outra chave.\nT� na hora da marreta!", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[25] = dialogue;
		
		//cena 1 pega marreta
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Isso vai servir!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[26] = dialogue;
		
		//ja pegou marreta
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: T� pesado! Vamos logo com isso!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[27] = dialogue;
	}
	
	public static Dialogue getDialogue(int id) {
		return DialogueDatabase.dialogues[id];
	}
}
