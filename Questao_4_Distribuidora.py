def calcular_percentuais(faturamentos):
    # Calcula o faturamento total
    total = sum(faturamentos.values())
    
    # Calcula e imprime o percentual de cada estado
    for estado, valor in faturamentos.items():
        percentual = (valor / total) * 100
        print(f"{estado}: R${valor:.2f} - {percentual:.2f}% de representação")

def main():
    # Dicionário com os estados e seus respectivos faturamentos
    faturamentos = {
        'SP': 67836.43,
        'RJ': 36678.66,
        'MG': 29229.88,
        'ES': 27165.48,
        'Outros': 19849.53
    }
    
    # Chama a função para calcular e exibir os percentuais
    calcular_percentuais(faturamentos)

if __name__ == "__main__":
    main()
