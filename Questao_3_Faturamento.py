import xml.etree.ElementTree as ET

def main():
    try:
        # Carregar o arquivo com os dados de faturamento
        tree = ET.parse('faturamento.xml')
        root = tree.getroot()

        faturamentos = []

        # chamando cada elemento "dia" e adiciona o valor de faturamento à lista
        for dia in root.findall('dia'):
            valor = float(dia.find('valor').text)
            if valor > 0:
                faturamentos.append(valor)

        # Calcular a maior, menor e media
        sum_faturamentos = sum(faturamentos)
        average = sum_faturamentos / len(faturamentos) if faturamentos else 0
        max_faturamento = max(faturamentos, default=0)
        min_faturamento = min(faturamentos, default=0)
        media = sum(faturamentos) / len(faturamentos) if faturamentos else 0 
        media = round (valor, 2)


        # calcular os dias com faturamentos acima da media
        dias_acima_media = sum(1 for valor in faturamentos if valor > average)

        # Imprime os resultados
        print(f"Menor valor de faturamento: {min_faturamento}")
        print(f"Maior valor de faturamento: {max_faturamento}")
        print(f"Número de dias com faturamento acima da média: {dias_acima_media}")
        print(f"Média de faturamento: {media}") 

    except Exception as e:
        print(f"Erro ao tentar carregar o arquivo: {e}")

if __name__ == "__main__":
    main()